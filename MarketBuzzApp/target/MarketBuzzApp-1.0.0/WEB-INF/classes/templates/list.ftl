<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Recommended Stocks </span></div>
		<div class="panel-body">
			<div class="table-responsive">
				<b style="font-family: 'Oswald', sans-serif;color: #0000FF; size: 30px;">Please type below to Search</b>
				</br>
				</br>
				<b style="font-family: 'Oswald', sans-serif; ">NAME : <input type = "text" ng-model = "marketTip.name"></b>
				</br>
				<b style="font-family: 'Oswald', sans-serif;">TYPE : <input type = "text" ng-model = "marketTip.callType"></b>
				</br>
				<b style="font-family: 'Oswald', sans-serif;">TIME : <input type = "text" ng-model = "marketTip.duration"></b>
				</br>
				<b style="font-family: 'Oswald', sans-serif;">DATE : <input type = "text" ng-model = "marketTip.callDate"></b>
				</br>
				<b style="font-family: 'Oswald', sans-serif;">STATUS : <input type = "text" ng-model = "marketTip.status"></b>
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