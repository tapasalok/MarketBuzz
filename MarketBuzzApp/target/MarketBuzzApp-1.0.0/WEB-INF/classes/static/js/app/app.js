'use strict';

var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
	BASE: 'http://localhost:8080',
    MARKET_TIP_SERVICE_API : 'http://localhost:8080/api/marketTip/',
    MARKET_ACTIVE_TIP_SERVICE_API : 'http://localhost:8080/api/activeMarketTip/',
    MESSAGES_SERVICE_API : 'http://localhost:8080/api/messages/',

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
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('tutorial', {
                url: '/tutorial',
                templateUrl: '/partials/tutorial',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('messages', {
                url: '/messages',
                templateUrl: '/partials/messages',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
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
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
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
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('analysis', {
                url: '/analysis',
                templateUrl: '/partials/analysis',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('multibagger', {
                url: '/multibagger',
                templateUrl: '/partials/multibagger',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }).state('about', {
                url: '/about',
                templateUrl: '/partials/about',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
//                        MarketTipService.loadAllActiveMarketTips().then(deferred.resolve, deferred.resolve);
                        MarketTipService.loadAllMessages().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            })  ;
        $urlRouterProvider.otherwise('/');
    }]);