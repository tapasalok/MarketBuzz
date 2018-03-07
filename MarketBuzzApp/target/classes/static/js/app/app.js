'use strict';

var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
	BASE: 'http://localhost:8080',
    MARKET_TIP_SERVICE_API : 'http://localhost:8080/api/marketTip/',
    MARKET_ACTIVE_TIP_SERVICE_API : 'http://localhost:8080/api/activeMarketTip/',
    MESSAGES_SERVICE_API : 'http://localhost:8080/api/messages/',

});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
	    $stateProvider.state('home', {
                url: '/',
                templateUrl: '/partials/list',
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
            }) ;
        $urlRouterProvider.otherwise('/');
    }]);