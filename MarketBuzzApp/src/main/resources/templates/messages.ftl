<div class="generic-container">
	<div class="panel panel-default">
		<!-- Default panel contents -->
		<div class="panel-heading">
			<span class="lead">Messages</span>
		</div>
		<div class="panel-body">
			<div class="table-responsive" style="padding: 12px">
				<form ng-submit="ctrl.saveMessage()" name="myMessageForm"
					class="form-horizontal">
					<input type="hidden" ng-model="ctrl.message.id" />
					<div class="row">
						<div class="form-group col-md-12">
							<label class="col-md-2 control-lable" for="content">Message Content</label>
							<div class="col-md-7">
								<input type="text" ng-model="ctrl.message.content" id="content"
									class="username form-control input-sm"
									placeholder="Enter Message" required ng-minlength="3" />
							</div>
						</div>
					</div>
					
					<div class="row">
						<div class="form-actions floatRight">
							<input type="submit"
								value="{{!ctrl.message.id ? 'Add' : 'Update'}}"
								class="btn btn-primary btn-sm"
								ng-disabled="myMessageForm.$invalid || myMessageForm.$pristine">
							<button type="button" ng-click="ctrl.reset()"
								class="btn btn-warning btn-sm" ng-disabled="myMessageForm.$pristine">Reset
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
			<span class="lead">List of Messages </span>
		</div>
		<div class="panel-body">
			<div class="table-responsive">
				<!-- <b style="font-family: 'Oswald', sans-serif;color: #0000FF; size: 30px;">Please type below to Search</b> -->
				 </br> </br>
				<div class="row">
					<div class="form-group col-md-12">
						<label class="col-md-2 control-lable">Message :</label>
						<div class="col-md-7">
							<input type="text" ng-model="message.content"
								class="form-control input-sm" placeholder="Enter Message" />
						</div>
					</div>
				</div>

				</br> </br>
				<table class="table table-hover">
					<thead>
						<tr>
							<th>ID</th>
							<th>MESSAGE</th>
						</tr>
					</thead>
					<tbody>
						<tr
							ng-repeat="u in ctrl.getAllMessages() | filter: message | orderBy:'-id'">
							<td>{{u.id}}</td>
							<td>{{u.content}}</td>
							<td><button type="button"
									ng-click="ctrl.editMessage(u.id)"
									class="btn btn-success custom-width">Edit</button></td>
							<td><button type="button"
									ng-click="ctrl.removeMessage(u.id)"
									class="btn btn-danger custom-width">Remove</button></td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</div>