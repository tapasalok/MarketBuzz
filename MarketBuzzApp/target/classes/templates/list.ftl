<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Recommended Stocks </span></div>
		<div class="panel-body">
			<div class="table-responsive">
				<b>Search By</b>
				</br>
				STOCK NAME : <input type = "text" ng-model = "marketTip.name">
				CALL TYPE : <input type = "text" ng-model = "marketTip.callType">
				DURATION : <input type = "text" ng-model = "marketTip.duration">
				CALL DATE : <input type = "text" ng-model = "marketTip.callDate">
				STATUS : <input type = "text" ng-model = "marketTip.status">
		        <table class="table table-hover">
		            <thead>
		            <tr>
		                <th>STOCK NAME</th>
		                <th>CALL TYPE</th>
		                <th>CMP</th>
		                <th>TRIGGER</th>
		                <th>TARGET</th>
		                 <th>SL</th>
		                  <th>PROFIT</th>
		                  <th>DURATION</th>
		                   <th>CALL DATE</th>
		                   <th>STATUS</th>
		                <th width="100"></th>
		                <th width="100"></th>
		            </tr>
		            </thead>
		            <tbody>
		            <tr ng-repeat="u in ctrl.getAllActiveMarketTips() | filter: marketTip | orderBy:'-profit'">
		                <td>{{u.name}}</td>
	                 	<td>{{u.callType}}</td>
	                 	<td>{{u.currentPrice}}</td>
		                <td>{{u.triggerPrice}}</td>
		                <td>{{u.targetPrice}}</td>
		                <td>{{u.stopLoss}}</td>
		                <td ng-if="$odd" style="background-color:#f1f1f1">{{u.profit | limitTo:5}}%</td>
		                <td ng-if="$even" style="background-color:#00FF00">{{u.profit | limitTo:5}}%</td>
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