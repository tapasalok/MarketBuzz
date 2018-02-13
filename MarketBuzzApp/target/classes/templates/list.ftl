<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Stock </span></div>
		<div class="panel-body">
	        <div class="formcontainer">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert" ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	                <input type="hidden" ng-model="ctrl.marketTip.id" />
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="uname">Stock Name</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.name" id="uname" class="username form-control input-sm" placeholder="Enter Stock Name" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                 </div>
	                 
	                <div class="row">
	                     <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="callType">Call Type</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.callType" id="callType" class="form-control input-sm" placeholder="Enter Call Type (Buy/Sell)" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
					
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="triggerPrice">Trigger Price</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.triggerPrice" id="triggerPrice" class="form-control input-sm" placeholder="Enter Trigger Price." required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                </div>
	                    
	                <div class="row">    
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="targetPrice">Target</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.targetPrice" id="targetPrice" class="form-control input-sm" placeholder="Enter Target." required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                </div>
	
					<div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="stopLoss">Stop Loss</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.stopLoss" id="stopLoss" class="form-control input-sm" placeholder="Enter Stop Loss." required ng-pattern="ctrl.onlyNumbers"/>
	                        </div>
	                    </div>
	                 </div>   
	                 
	                 <div class="row">    
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="duration">Duration</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.duration" id="duration" class="form-control input-sm" placeholder="Enter Duration." required required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>	
						
					<div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="callDate">Call Date</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.marketTip.callDate" id="callDate" class="form-control input-sm" placeholder="Enter Call Date." required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>		
						
	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="{{!ctrl.marketTip.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                        <button type="button" ng-click="ctrl.reset()" class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset Form</button>
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">List of Stocks </span></div>
		<div class="panel-body">
			<div class="table-responsive">
		        <table class="table table-hover">
		            <thead>
		            <tr>
		                <th>ID</th>
		                <th>STOCK NAME</th>
		                <th>CALL TYPE</th>
		                <th>TRIGGER PRICE</th>
		                <th>TARGET</th>
		                 <th>STOP LOSS</th>
		                  <th>DURATION</th>
		                   <th>CALL DATE</th>
		                <th width="100"></th>
		                <th width="100"></th>
		            </tr>
		            </thead>
		            <tbody>
		            <tr ng-repeat="u in ctrl.getAllMarketTips()">
		                <td>{{u.id}}</td>
		                <td>{{u.name}}</td>
	                 	<td>{{u.callType}}</td>
		                <td>{{u.triggerPrice}}</td>
		                <td>{{u.targetPrice}}</td>
		                <td>{{u.stopLoss}}</td>
		                <td>{{u.duration}}</td>
		                <td>{{u.callDate}}</td>
		                <td><button type="button" ng-click="ctrl.editMarketTip(u.id)" class="btn btn-success custom-width">Edit</button></td>
		                <td><button type="button" ng-click="ctrl.removeMarketTip(u.id)" class="btn btn-danger custom-width">Remove</button></td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
    </div>
</div>