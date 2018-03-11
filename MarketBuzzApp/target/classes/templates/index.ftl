<!DOCTYPE html>

<html lang="en" ng-app="crudApp">
    <head>
	    <meta charset='utf-8'>
	   <meta http-equiv="X-UA-Compatible" content="IE=edge">
	   <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>GoToStock</title>
        <link href="/css/bootstrap.css" rel="stylesheet"/>
        <link href="/css/app.css" rel="stylesheet"/>
        <link href="/css/gotostock.css" rel="stylesheet"/>

		<script async
			src="//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
		<script>
			(adsbygoogle = window.adsbygoogle || []).push({
				google_ad_client : "ca-pub-1677486636244083",
				enable_page_level_ads : true
			});
		</script>
</head>
    <body>
		<div style="background:  url('/css/images/background.jpg')">
		<div >
		<div class="panel panel-default" style="margin-left: 5px; margin-top: 5px; margin-right: 5px;">
				<div class="tablecontainer" id='cssmenu'>
					<ul>
						<li class='active'><a href='#'>Stocks</a></li>
						<!-- <li><a href='#/learning'>Learning</a></li> -->
						<li><a href='#'>Others</a></li>
						<li><a href='#'>About</a></li>
						<li><a href='#/disclaimer'>Disclaimer</a></li>
					</ul>
				</div>
			</div>
			<div ui-view></div>
        	</div>
		</div>
		
        <div>
        	<label style="color: #000000;margin: 10px;">This site has been designed for informational and educational purposes only and does not constitute an offer to sell nor a solicitation of an offer to buy any security / stocks which may be referenced upon the web site. The services and information provided through this web site are for personal, non-commercial, educational use and display. The accuracy, completeness and timeliness of the information contained on this site cannot be guaranteed. We don’t give promise of any sure income/return/profit as intraday trading can be risky too. Nobody can be 100% Sure in the share market. Only Intraday Tips is not responsible for any losses incurred by acting on the our recommendations or our view. You should be aware of risk in trading using our recommendations (share tips services). Investors are advised to take the services of a competent 'Investment Adviser', before making any investment decision. The targets expressed are based on technical and fundamental analysis and does not guarantee success. The use of this app is at your own risk. *GoToStock* is not responsible for any losses. All data and details given are for educational purpose only.</label>
        </div>
        
        <script src="/js/lib/angular.min.js" ></script>
        <script src="/js/lib/angular-ui-router.min.js" ></script>
        <script src="/js/lib/localforage.min.js" ></script>
        <script src="/js/lib/ngStorage.min.js"></script>
        <script src="/js/app/app.js"></script>
         <script src="/js/app/hello.js"></script>
        <script src="/js/app/MarketTipService.js"></script>
        <script src="/js/app/MarketTipController.js"></script>
        <script src="http://code.jquery.com/jquery-latest.min.js" type="text/javascript"></script>
        <script src="/js/app/gotostock.js"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular.js"></script>
    	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.4/angular-route.js"></script>
    	<!-- <script src="/js/app/ItemListController.js"></script>
		<script src="/js/app/ItemDetailsController.js"></script>
		<script src="/js/app/ItemService.js"></script> -->
		
    </body>
</html>