<div class="generic-container">
    <div class="panel panel-default" style="text-align: center">
        <!-- Default panel contents -->
        <div class="panel-heading"><span class="lead">GoToStock (Happy Investment. Happy Trading!)</span></div>
        <ul style="color:#2b8341; font-size:16px; margin: 10px; font-weight:bold;">
		  <li>Daily INTRADAY Calls For Traders</li>
		  <li>MULTIBAGGER Stock Ideas For Investors</li>
		</ul>  
        
		<div class="panel-body">
			<div class="table-responsive">
				
				<table style="padding-left: 12px" class="table table-hover" id="table_messages">
		            <tbody>
		            <tr ng-repeat="u in ctrl.getMessages()">
		                <td align="center" style="font-size: 12px;color: #2b8341; font-weight:normal; padding-left: 12px;"><a  href="{{u.url}}" target="_blank" >{{u.content}}</a></td>
		            </tr>
		            <br>
		            <br>
		            <tr>
		                <td align="center" id="link_bar">
                       	<a  href="https://api.whatsapp.com/send?phone=916361059258&text=REGISTERWEB" target="_blank">Click here to message and receive updates</a>
                        </td>
                    <tr>  
                    <tr>  
                        <td align="center" >
                        <a href="https://zerodha.com/open-account?c=ZMPAVT" target="_blank"><img src="/css/images/open-zerodha-account.png"></a>
                    	</td>
		            </tr>
		            </tbody>
		        </table>
				
				<label style="padding-left:12px;" class="control-lable">*Note: Only members who have added number (+91-6361059258) to their phone's address book will receive broadcast message.</label>
				</br>
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
				<div style="padding-left: 12px"><span style="font-size: 20px;">Recommended Stocks</span></div>
		        <table class="table table-hover" id="table_list">
		            <thead>
		            <tr>
		            	<th>REC ID</th>
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
		            <tr ng-repeat="u in ctrl.getAllActiveMarketTips() | filter: marketTip | orderBy:'-id'">
		                <td>{{u.id}}</td>
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