'use strict';

angular.module('crudApp').factory('MarketTipService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                loadAllMarketTips: loadAllMarketTips,
                getAllMarketTips: getAllMarketTips,
                loadAllActiveMarketTips: loadAllActiveMarketTips,
                getAllActiveMarketTips: getAllActiveMarketTips,
                getMarketTip: getMarketTip,
                createMarketTip: createMarketTip,
                updateMarketTip: updateMarketTip,
                removeMarketTip: removeMarketTip
            };

            return factory;

            function loadAllMarketTips() {
                console.log('Fetching all MarketTips');
                var deferred = $q.defer();
                $http.get(urls.MARKET_TIP_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Fetched successfully all MarketTips');
                            $localStorage.marketTips = response.data;
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while loading MarketTips');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
            
            function loadAllActiveMarketTips() {
                console.log('Fetching all Active MarketTips');
                var deferred = $q.defer();
                $http.get(urls.MARKET_ACTIVE_TIP_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Fetched successfully all Active MarketTips');
                            $localStorage.marketTips = response.data;
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while loading Active MarketTips');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function getAllMarketTips(){
                return $localStorage.marketTips;
            }
            
            function getAllActiveMarketTips(){
                return $localStorage.marketTips;
            }

            function getMarketTip(id) {
                console.log('Fetching MarketTip with id :'+id);
                var deferred = $q.defer();
                $http.get(urls.MARKET_TIP_SERVICE_API + id)
                    .then(
                        function (response) {
                            console.log('Fetched successfully MarketTip with id :'+id);
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while loading MarketTip with id :'+id);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function createMarketTip(marketTip) {
                console.log('Creating MarketTip');
                var deferred = $q.defer();
                $http.post(urls.MARKET_TIP_SERVICE_API, marketTip)
                    .then(
                        function (response) {
                            loadAllMarketTips();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                           console.error('Error while creating MarketTip : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function updateMarketTip(marketTip, id) {
                console.log('Updating MarketTip with id '+id);
                var deferred = $q.defer();
                $http.put(urls.MARKET_TIP_SERVICE_API + id, marketTip)
                    .then(
                        function (response) {
                            loadAllMarketTips();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while updating MarketTip with id :'+id);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

            function removeMarketTip(id) {
                console.log('Removing MarketTip with id '+id);
                var deferred = $q.defer();
                $http.delete(urls.MARKET_TIP_SERVICE_API + id)
                    .then(
                        function (response) {
                            loadAllMarketTips();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while removing MarketTip with id :'+id);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

        }
    ]);