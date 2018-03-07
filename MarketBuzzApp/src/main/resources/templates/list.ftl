<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Recommended Stocks </span></div>
		<div class="panel-body">
			<div class="table-responsive">
				
				<table style="padding-left: 12px" class="table table-hover" id="table_messages">
		            <tbody>
		            <tr ng-repeat="u in ctrl.getMessages()">
		                <td style="font-size: 11px; font-family: 'Oswald', sans-serif; color: #000000;">{{u.content}} </td>
		                <div align="center" style="padding-left: 10px" id="link_bar"> <a href="https://api.whatsapp.com/send?phone=916361059258">Click here to message</a> </div>
		            </tr>
		            </tbody>
		        </table>
				
			<!-- 	<div ng-controller="Hello">
					<b style="font-family: 'Oswald', sans-serif;color: #0000FF; size: 30px; padding: 10px;">Welcome Go To Stock</b>
					<p>The ID is {{greeting.id}}</p>
					<p>The content is {{greeting.content}}</p>
				</div> -->
			
				
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
				
		        <table class="table table-hover" id="table_list">
		            <thead>
		            <tr>
		            	<th>DATE</th>
		                <th>STOCK</th>
		                <th>CALL</th>
		                <th>CURRENT</th>
		                <th>TRIGGER</th>
		                <th>TARGET</th>
		                 <th>SL</th>
		                  <th>U/D</th>
		                  <th>TIME</th>
		                   <th>STATUS</th>
		            </tr>
		            </thead>
		            <tbody>
		            <tr ng-repeat="u in ctrl.getAllActiveMarketTips() | filter: marketTip | orderBy:'-callDate'">
		                <td>{{u.callDate}}</td>
		                <td>{{u.name}}</td>
	                 	<td>{{u.callType}}</td>
	                 	<td>{{u.currentPrice | limitTo:7}}</td>
		                <td>{{u.triggerPrice | limitTo:7}}</td>
		                <td>{{u.targetPrice | limitTo:7}}</td>
		                <td>{{u.stopLoss | limitTo:5}}</td>
		                <td>{{u.profit | limitTo:5}}%</td>
		                <td>{{u.duration}}</td>
		                <td>{{u.status}}</td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
    </div>
</div>