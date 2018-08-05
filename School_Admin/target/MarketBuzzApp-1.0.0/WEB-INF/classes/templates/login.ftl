<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Login </span></div>
		<div class="panel-body">
	        <div class="formcontainer">
	            <div class="alert alert-success" role="alert" ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
	            <div class="alert alert-danger" role="alert" ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
	            <form ng-submit="ctrl.submit()" name="myForm" class="form-horizontal">
	                <input type="hidden" ng-model="ctrl.user.id" />
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="uname">Username</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.user.name" id="uname" class="username form-control input-sm" placeholder="Enter Username" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                 </div>
					
	                <div class="row">
	                    <div class="form-group col-md-12">
	                        <label class="col-md-2 control-lable" for="password">Password</label>
	                        <div class="col-md-7">
	                            <input type="text" ng-model="ctrl.user.password" id="password" class="form-control input-sm" placeholder="Enter Password" required ng-minlength="3"/>
	                        </div>
	                    </div>
	                </div>
						
	                <div class="row">
	                    <div class="form-actions floatRight">
	                        <input type="submit"  value="{{!ctrl.user.id ? 'Add' : 'Update'}}" class="btn btn-primary btn-sm" ng-disabled="myForm.$invalid || myForm.$pristine">
	                    </div>
	                </div>
	            </form>
    	    </div>
		</div>	
    </div>
</div>