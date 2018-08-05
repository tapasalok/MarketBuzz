'use strict';

angular.module('crudApp').factory('MarketTipService',
    ['$localStorage', '$http', '$q', 'urls',
        function ($localStorage, $http, $q, urls) {

            var factory = {
                loadAllMarketTips: loadAllMarketTips,
                loadAllMessages: loadAllMessages,
                getAllMarketTips: getAllMarketTips,
                getAllMessages: getAllMessages,
                getMessages: getMessages,
                loadAllActiveMarketTips: loadAllActiveMarketTips,
                getAllActiveMarketTips: getAllActiveMarketTips,
                getMarketTip: getMarketTip,
                getMessage: getMessage,
                createMessage: createMessage,
                createMarketTip: createMarketTip,
                updateMarketTip: updateMarketTip,
                updateMessage: updateMessage,
                removeMarketTip: removeMarketTip,
                removeMessage: removeMessage
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
            
            
            function loadAllMessages(){
           	 console.log('Fetching all Messages');
                var deferred = $q.defer();
                $http.get(urls.MESSAGES_SERVICE_API)
                    .then(
                        function (response) {
                            console.log('Fetched successfully all Messages');
                            $localStorage.messages = response.data;
                            deferred.resolve(response);
                        },
                        function (errResponse) {
                            console.error('Error while loading Messages');
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
           }
            
            function getAllMessages(){
            	return $localStorage.messages;
            }
            
            function getMessages(){
                return $localStorage.messages;
            }
            
            function getAllActiveMarketTips(){
                return $localStorage.marketTips;
            }

            
            function getMessage(id) {
                console.log('Fetching Message with id :'+id);
                var deferred = $q.defer();
                $http.get(urls.MESSAGES_SERVICE_API + id)
                    .then(
                        function (response) {
                            console.log('Fetched successfully Message with id :'+id);
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while loading Message with id :'+id);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
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

            function createMessage(messsage) {
                console.log('Creating Message');
                var deferred = $q.defer();
                $http.post(urls.MESSAGES_SERVICE_API, messsage)
                    .then(
                        function (response) {
                            loadAllMessages();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                           console.error('Error while creating Message : '+errResponse.data.errorMessage);
                           deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }
            
            function updateMessage(messsage, id) {
                console.log('Updating Message with id '+id);
                var deferred = $q.defer();
                $http.put(urls.MESSAGES_SERVICE_API + id, messsage)
                    .then(
                        function (response) {
                        	loadAllMessages();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while updating Message with id :'+id);
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
            
            function removeMessage(id) {
                console.log('Removing Message with id '+id);
                var deferred = $q.defer();
                $http.delete(urls.MESSAGES_SERVICE_API + id)
                    .then(
                        function (response) {
                        	loadAllMessages();
                            deferred.resolve(response.data);
                        },
                        function (errResponse) {
                            console.error('Error while removing Message with id :'+id);
                            deferred.reject(errResponse);
                        }
                    );
                return deferred.promise;
            }

        }
    ]);