var app = angular.module('crudApp',['ui.router','ngStorage']);

app.constant('urls', {
    BASE: 'http://MarketBuzz-2119010721.ap-south-1.elb.amazonaws.com:8080/MarketBuzzApp',
    MARKET_TIP_SERVICE_API : 'http://MarketBuzz-2119010721.ap-south-1.elb.amazonaws.com:8080/MarketBuzzApp/api/marketTip/',
});

app.config(['$stateProvider', '$urlRouterProvider',
    function($stateProvider, $urlRouterProvider) {
	    $stateProvider
            .state('home', {
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
            });
        $urlRouterProvider.otherwise('/');
    }]);