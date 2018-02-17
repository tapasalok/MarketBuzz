'use strict';

angular.module('crudApp').controller('MarketTipController',
    ['MarketTipService', '$scope',  function( MarketTipService, $scope) {

        var self = this;
        self.marketTip = {};
        self.marketTips=[];

        self.submit = submit;
        self.getAllUsers = getAllUsers;
        self.createUser = createUser;
        self.updateUser = updateUser;
        self.removeUser = removeUser;
        self.editUser = editUser;
        self.reset = reset;

        self.successMessage = '';
        self.errorMessage = '';
        self.done = false;

        self.onlyIntegers = /^\d+$/;
        self.onlyNumbers = /^\d+([,.]\d+)?$/;

        function submit() {
            console.log('Submitting');
            if (self.marketTip.id === undefined || self.marketTip.id === null) {
                console.log('Saving New User', self.marketTip);
                createUser(self.marketTip);
            } else {
                updateUser(self.marketTip, self.marketTip.id);
                console.log('User updated with id ', self.marketTip.id);
            }
        }

        function createUser(marketTip) {
            console.log('About to create user');
            MarketTipService.createUser(marketTip)
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


        function updateUser(marketTip, id){
            console.log('About to update user');
            MarketTipService.updateUser(marketTip, id)
                .then(
                    function (response){
                        console.log('User updated successfully');
                        self.successMessage='User updated successfully';
                        self.errorMessage='';
                        self.done = true;
                        $scope.myForm.$setPristine();
                    },
                    function(errResponse){
                        console.error('Error while updating User');
                        self.errorMessage='Error while updating User '+errResponse.data;
                        self.successMessage='';
                    }
                );
        }


        function removeUser(id){
            console.log('About to remove User with id '+id);
            MarketTipService.removeUser(id)
                .then(
                    function(){
                        console.log('User '+id + ' removed successfully');
                    },
                    function(errResponse){
                        console.error('Error while removing user '+id +', Error :'+errResponse.data);
                    }
                );
        }


        function getAllUsers(){
            return MarketTipService.getAllUsers();
        }

        function editUser(id) {
            self.successMessage='';
            self.errorMessage='';
            MarketTipService.getUser(id).then(
                function (marketTip) {
                    self.marketTip = marketTip;
                },
                function (errResponse) {
                    console.error('Error while removing user ' + id + ', Error :' + errResponse.data);
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