<div class="generic-container">
    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">Recommended Stocks </span></div>
		<div class="panel-body">
			<div class="table-responsive">
		        <table class="table table-hover">
		            <thead>
		            <tr>
		                <th>STOCK NAME</th>
		                <th>CALL TYPE</th>
		                <th>CMP</th>
		                <th>TRIGGER PRICE</th>
		                <th>TARGET</th>
		                 <th>STOP LOSS</th>
		                  <th>POINTS</th>
		                  <th>DURATION</th>
		                   <th>CALL DATE</th>
		                <th width="100"></th>
		                <th width="100"></th>
		            </tr>
		            </thead>
		            <tbody>
		            <tr ng-repeat="u in ctrl.getAllMarketTips()">
		                <td>{{u.name}}</td>
	                 	<td>{{u.callType}}</td>
	                 	<td>{{u.currentPrice}}</td>
		                <td>{{u.triggerPrice}}</td>
		                <td>{{u.targetPrice}}</td>
		                <td>{{u.stopLoss}}</td>
		                <td>{{u.profit}}</td>
		                <td>{{u.duration}}</td>
		                <td>{{u.callDate}}</td>
		            </tr>
		            </tbody>
		        </table>		
			</div>
		</div>
    </div>
</div>