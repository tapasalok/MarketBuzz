<div class="generic-container">
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<span class="lead">Stock </span>
		</div>
		<div class="panel-body">
			<div class="formcontainer">
				<div class="alert alert-success" role="alert"
					ng-if="ctrl.successMessage">{{ctrl.successMessage}}</div>
				<div class="alert alert-danger" role="alert"
					ng-if="ctrl.errorMessage">{{ctrl.errorMessage}}</div>
				<form ng-submit="ctrl.submit()" name="myForm"
					class="form-horizontal">
					<input type="hidden" ng-model="ctrl.marketTip.id" />
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="uname">Stock
								Name</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.name" id="uname"
									class="username form-control input-sm"
									placeholder="Enter Stock Name" required ng-minlength="3" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="callType">Call
								Type</label>
							<div class="col-md-7">
								<select ng-model="ctrl.marketTip.callType" id="callType"
									class="form-control input-sm" required ng-maxlength="20">
									<option value="" disabled selected>Select Call Type
										(Buy/Sell)</option>
									<option value="Intraday Buy">Intraday Buy</option>
									<option value="Intraday Sell">Intraday Sell</option>
									<option value="Short Term Buy">Short Term Buy</option>
									<option value="Long Term Buy">Long Term Buy</option>
									<option value="Multibagger Buy">Multibagger Buy</option>
								</select>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="currentPrice">Current
								Price</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.currentPrice"
									id="currentPrice" class="form-control input-sm"
									placeholder="Enter Current Price." required
									ng-pattern="ctrl.onlyNumbers" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="triggerPrice">Trigger
								Price</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.triggerPrice"
									id="triggerPrice" class="form-control input-sm"
									placeholder="Enter Trigger Price." required
									ng-pattern="ctrl.onlyNumbers" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="targetPrice">Target</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.targetPrice"
									id="targetPrice" class="form-control input-sm"
									placeholder="Enter Target." required
									ng-pattern="ctrl.onlyNumbers" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="stopLoss">Stop
								Loss</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.stopLoss"
									id="stopLoss" class="form-control input-sm"
									placeholder="Enter Stop Loss." required
									ng-pattern="ctrl.onlyNumbers" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="duration">Duration</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.duration"
									id="duration" class="form-control input-sm"
									placeholder="Enter Duration." required required
									ng-minlength="3" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="callDate">Call
								Date</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.marketTip.callDate"
									id="callDate" class="form-control input-sm"
									placeholder="Enter Call Date." required ng-minlength="3" />
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="status">Status</label>
							<div class="col-md-7">
								<select ng-model="ctrl.marketTip.status" id="status"
									class="form-control input-sm" required ng-minlength="6">
									<option value="" disabled selected>Select Status
										(Active/Target Met/InActive/SL Hit)</option>
									<option value="Active">Active</option>
									<option value="Target Met">Target Met</option>
									<option value="InActive">InActive</option>
									<option value="SL Hit">SL Hit</option>
									<option value="Partial Booking">Partial Booking</option>
								</select>
							</div>
						</div>
					</div>

					<div class="row">
						<div class="form-actions floatRight">
							<input type="submit"
								value="{{!ctrl.marketTip.id ? 'Add' : 'Update'}}"
								class="btn btn-primary btn-sm"
								ng-disabled="myForm.$invalid || myForm.$pristine">
							<button type="button" ng-click="ctrl.reset()"
								class="btn btn-warning btn-sm" ng-disabled="myForm.$pristine">Reset
								Form</button>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<span class="lead">List of Stocks </span>
		</div>
		<div class="panel-body">
			<div class="table-responsive">
				<!-- <b style="font-family: 'Oswald', sans-serif;color: #0000FF; size: 30px;">Please type below to Search</b> -->
				 </br> </br>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-2 control-lable">STOCK NAME :</label>
						<div class="col-md-7">
							<input type="text" ng-model="marketTip.name"
								class="form-control input-sm" placeholder="Enter Stock Name" />
						</div>
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-2 control-lable">CALL TYPE :</label>
						<div class="col-md-7">
							<input type="text" ng-model="marketTip.callType"
								class="form-control input-sm" placeholder="Enter Buy/Sell" />
						</div>
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-2 control-lable">DURATION :</label>
						<div class="col-md-7">
							<input type="text" ng-model="marketTip.duration"
								class="form-control input-sm" placeholder="Enter Duration (E.g.: 1 Month)" />
						</div>
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-2 control-lable">CALL DATE :</label>
						<div class="col-md-7">
							<input type="text" ng-model="marketTip.callDate"
								class="form-control input-sm" placeholder="Enter Call Date (E.g.: 1 Feb)" />
						</div>
					</div>
				</div>

				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-2 control-lable">STATUS :</label>
						<div class="col-md-7">
							<input type="text" ng-model="marketTip.status"
								class="form-control input-sm" placeholder="Enter Status (Active/Target Met)" />
						</div>
					</div>
				</div>

				</br> </br>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>STOCK NAME</th>
							<th>CALL TYPE</th>
							<th>CMP</th>
							<th>TRIGGER</th>
							<th>TARGET</th>
							<th>SL</th>
							<th>UP/DOWN</th>
							<th>DURATION</th>
							<th>CALL DATE</th>
							<th>STATUS</th>
						</tr>
					</thead>
					<tbody>
						<tr
							ng-repeat="u in ctrl.getAllMarketTips() | filter: marketTip | orderBy:'-id'">
							<td>{{u.id}}</td>
							<td>{{u.name}}</td>
							<td>{{u.callType}}</td>
							<td>{{u.currentPrice}}</td>
							<td>{{u.triggerPrice}}</td>
							<td>{{u.targetPrice}}</td>
							<td>{{u.stopLoss}}</td>
							<td ng-if="$odd" style="background-color: #f1f1f1">{{u.profit
								| limitTo:6}}%</td>
							<td ng-if="$even" style="background-color: #00FF00">{{u.profit
								| limitTo:6}}%</td>
							<td>{{u.duration}}</td>
							<td>{{u.callDate}}</td>
							<td>{{u.status}}</td>
							<td><button type="button"
									ng-click="ctrl.editMarketTip(u.id)"
									class="btn btn-success custom-width">Edit</button></td>
							<td><button type="button"
									ng-click="ctrl.removeMarketTip(u.id)"
									class="btn btn-danger custom-width">Remove</button></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>