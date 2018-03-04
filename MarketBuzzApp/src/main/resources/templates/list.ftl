<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Recommended Stocks </span></div>
		<div class="panel-body">
			<div class="table-responsive">
				<b style="font-family: 'Oswald', sans-serif;color: #0000FF; size: 30px;">Please type below to Search</b>
				</br>
				</br>
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
						<label class="col-md-2 control-lable">STATUS :</label>
						<div class="col-md-7">
							<input type="text" ng-model="marketTip.status"
								class="form-control input-sm" placeholder="Enter Status (Active/Target Met)" />
						</div>
					</div>
				</div>
				</br>
				</br>
				
		        <table class="table table-hover" id="table_list">
		            <thead>
		            <tr>
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
		            <tr ng-repeat="u in ctrl.getAllActiveMarketTips() | filter: marketTip | orderBy:'-callDate'">
		                <td>{{u.name}}</td>
	                 	<td>{{u.callType}}</td>
	                 	<td>{{u.currentPrice | limitTo:7}}</td>
		                <td>{{u.triggerPrice | limitTo:7}}</td>
		                <td>{{u.targetPrice | limitTo:7}}</td>
		                <td>{{u.stopLoss | limitTo:5}}</td>
		                <td>{{u.profit | limitTo:5}}%</td>
		                <td>{{u.duration}}</td>
		                <td>{{u.callDate}}</td>
		                <td>{{u.status}}</td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
    </div>
</div>