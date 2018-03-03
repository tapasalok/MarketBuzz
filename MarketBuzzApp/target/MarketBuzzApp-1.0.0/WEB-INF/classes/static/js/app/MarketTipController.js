'use strict';

angular.module('crudApp').controller('MarketTipController',
    ['MarketTipService', '$scope',  function( MarketTipService, $scope) {

        var self = this;
        self.marketTip = {};
        self.marketTips=[];

        self.submit = submit;
        self.getAllMarketTips = getAllMarketTips;
        self.getAllActiveMarketTips = getAllActiveMarketTips;
        self.createMarketTip = createMarketTip;
        self.updateMarketTip = updateMarketTip;
        self.removeMarketTip = removeMarketTip;
        self.editMarketTip = editMarketTip;
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


        function getAllMarketTips(){
            return MarketTipService.getAllMarketTips();
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
        function reset(){
            self.successMessage='';
            self.errorMessage='';
            self.marketTip={};
            $scope.myForm.$setPristine(); //reset Form
        }
    }


    ]);