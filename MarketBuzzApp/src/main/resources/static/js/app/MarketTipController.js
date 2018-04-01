'use strict';

angular.module('crudApp').controller('MarketTipController',
    ['MarketTipService', '$scope',  function( MarketTipService, $scope) {

        var self = this;
        self.marketTip = {};
        self.marketTips=[];

        self.submit = submit;
        self.saveMessage = saveMessage;
        self.getAllMarketTips = getAllMarketTips;
        self.getAllMessages = getAllMessages;
        self.getMessages = getMessages;
        self.getAllActiveMarketTips = getAllActiveMarketTips;
        self.createMessage = createMessage;
        self.createMarketTip = createMarketTip;
        self.updateMarketTip = updateMarketTip;
        self.updateMessage = updateMessage;
        self.removeMarketTip = removeMarketTip;
        self.removeMessage = removeMessage;
        self.editMarketTip = editMarketTip;
        self.editMessage = editMessage;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function submit() {
            console.log('Submitting');
            if (self.marketTip.id === undefined || self.marketTip.id === null) {
                console.log('Saving New MarketTip', self.marketTip);
                createMarketTip(self.marketTip);
            } else {
                updateMarketTip(self.marketTip, self.marketTip.id);
                console.log('MarketTip updated with id ', self.marketTip.id);
            }
        }

        function saveMessage() {
            console.log('saveMessage Controller');
            if (self.message.id === undefined || self.message.id === null) {
                console.log('Saving New Message', self.message);
                createMessage(self.message);
            } else {
                updateMessage(self.message, self.message.id);
                console.log('Message updated with id ', self.message.id);
            }
        }
        
        
        function createMessage(message) {
            console.log('About to create Message');
            MarketTipService.createMessage(message)
                .then(
                    function (response) {
                        console.log('Message inserted successfully');
                        self.successMessage = 'Message inserted successfully';
                        self.errorMessage='';
                        self.done = true;
                        self.message={};
                        $scope.myMessageForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while creating Message');
                        self.errorMessage = 'Error while creating Message: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }
        
        function createMarketTip(marketTip) {
            console.log('About to create MarketTip');
            MarketTipService.createMarketTip(marketTip)
                .then(
                    function (response) {
                        console.log('Stock inserted successfully');
                        self.successMessage = 'Stock inserted successfully';
                        self.errorMessage='';
                        self.done = true;
                        self.marketTip={};
                        $scope.myForm.$setPristine();
                    },
                    function (errResponse) {
                        console.error('Error while creating Stock');
                        self.errorMessage = 'Error while creating Stock: ' + errResponse.data.errorMessage;
                        self.successMessage='';
                    }
                );
        }


        function updateMessage(message, id){
            console.log('About to update Message');
            MarketTipService.updateMessage(message, id)
                .then(
                    function (response){
                        console.log('Message updated successfully');
                        self.successMessage='Message updated successfully';
                        self.errorMessage='';
                        self.done = true;
                        $scope.myMessageForm.$setPristine();
                    },
                    function(errResponse){
                        console.error('Error while updating Message');
                        self.errorMessage='Error while updating Message '+errResponse.data;
                        self.successMessage='';
                    }
                );
        }

        
        function updateMarketTip(marketTip, id){
            console.log('About to update MarketTip');
            MarketTipService.updateMarketTip(marketTip, id)
                .then(
                    function (response){
                        console.log('MarketTip updated successfully');
                        self.successMessage='MarketTip updated successfully';
                        self.errorMessage='';
                        self.done = true;
                        $scope.myForm.$setPristine();
                    },
                    function(errResponse){
                        console.error('Error while updating MarketTip');
                        self.errorMessage='Error while updating MarketTip '+errResponse.data;
                        self.successMessage='';
                    }
                );
        }


        function removeMarketTip(id){
            console.log('About to remove MarketTip with id '+id);
            MarketTipService.removeMarketTip(id)
                .then(
                    function(){
                        console.log('MarketTip '+id + ' removed successfully');
                    },
                    function(errResponse){
                        console.error('Error while removing MarketTip '+id +', Error :'+errResponse.data);
                    }
                );
        }
        
        function removeMessage(id){
            console.log('About to remove Message with id '+id);
            MarketTipService.removeMessage(id)
                .then(
                    function(){
                        console.log('Message '+id + ' removed successfully');
                    },
                    function(errResponse){
                        console.error('Error while removing Message '+id +', Error :'+errResponse.data);
                    }
                );
        }


        function getAllMarketTips(){
            return MarketTipService.getAllMarketTips();
        }
        
        function getAllMessages(){
            return MarketTipService.getAllMessages();
        }
        
        function getMessages(){
            return MarketTipService.getMessages();
        }
        
        function getAllActiveMarketTips(){
            return MarketTipService.getAllActiveMarketTips();
        }


        function editMarketTip(id) {
            self.successMessage='';
            self.errorMessage='';
            MarketTipService.getMarketTip(id).then(
                function (marketTip) {
                    self.marketTip = marketTip;
                },
                function (errResponse) {
                    console.error('Error while removing MarketTip ' + id + ', Error :' + errResponse.data);
                }
            );
        }
        
        function editMessage(id) {
            self.successMessage='';
            self.errorMessage='';
            MarketTipService.getMessage(id).then(
                function (message) {
                    self.message = message;
                },
                function (errResponse) {
                    console.error('Error while removing Message ' + id + ', Error :' + errResponse.data);
                }
            );
        }
        
        function reset(){
            self.successMessage='';
            self.errorMessage='';
            self.marketTip={};
            $scope.myForm.$setPristine(); //reset Form
        }
    }


    ]);