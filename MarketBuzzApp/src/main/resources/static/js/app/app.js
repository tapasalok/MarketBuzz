'use strict';

var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
	BASE: 'http://ec2-13-127-125-189.ap-south-1.compute.amazonaws.com',
    MARKET_TIP_SERVICE_API : 'http://ec2-13-127-125-189.ap-south-1.compute.amazonaws.com/api/marketTip/',
    MARKET_ACTIVE_TIP_SERVICE_API : 'http://ec2-13-127-125-189.ap-south-1.compute.amazonaws.com/api/activeMarketTip/',
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
	    $stateProvider.state('home', {
                url: '/',
                templateUrl: '/partials/admin',
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