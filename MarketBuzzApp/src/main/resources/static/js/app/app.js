'use strict';

var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
	BASE: 'http://www.gotostock.club',
    MARKET_TIP_SERVICE_API : 'http://www.gotostock.club/api/marketTip/',
    MARKET_ACTIVE_TIP_SERVICE_API : 'http://www.gotostock.club/api/activeMarketTip/',
    MESSAGES_SERVICE_API : 'http://www.gotostock.club/api/messages/',

});

app.config(['$stateProvider', '$urlRouterProvider', '$locationProvider',
    function($stateProvider, $urlRouterProvider, $locationProvider) {
	    $stateProvider.state('home', {
                url: '/',
                templateUrl: '/partials/admin',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.getAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('learning', {
                url: '/learning',
                templateUrl: '/partials/login',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.getAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('disclaimer', {
                url: '/disclaimer',
                templateUrl: '/partials/disclaimer',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.getAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }) ;
        $urlRouterProvider.otherwise('/');
    }]);