'use strict';

var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://localhost:8080/MarketBuzzApp',
    MARKET_TIP_SERVICE_API : 'http://localhost:80/MarketBuzzApp/api/marketTip/',
    MARKET_ACTIVE_TIP_SERVICE_API : 'http://localhost:80/MarketBuzzApp/api/activeMarketTip/',
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
	    $stateProvider.state('home', {
                url: '/',
                templateUrl: '/MarketBuzzApp/partials/list',
                controller:'MarketTipController',
                controllerAs:'ctrl',
                resolve: {
                	marketTips: function ($q, MarketTipService) {
                        console.log('Load all MarketTips');
                        var deferred = $q.defer();
                        MarketTipService.loadAllMarketTips().then(deferred.resolve, deferred.resolve);
                        return deferred.promise;
                    }
                }
            }) ;
        $urlRouterProvider.otherwise('/');
    }]);