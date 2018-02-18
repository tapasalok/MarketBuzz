<!DOCTYPE html>

<html lang="en" ng-app="crudApp">
    <head>
        <title>${title}</title>
        <link href="/MarketBuzzApp/css/bootstrap.css" rel="stylesheet"/>
        <link href="/MarketBuzzApp/css/app.css" rel="stylesheet"/>
    </head>
    <body>

        <div ui-view></div>
        <script src="/MarketBuzzApp/js/lib/angular.min.js" ></script>
        <script src="/MarketBuzzApp/js/lib/angular-ui-router.min.js" ></script>
        <script src="/MarketBuzzApp/js/lib/localforage.min.js" ></script>
        <script src="/MarketBuzzApp/js/lib/ngStorage.min.js"></script>
        <script src="/MarketBuzzApp/js/app/app.js"></script>
        <script src="/MarketBuzzApp/js/app/MarketTipService.js"></script>
        <script src="/MarketBuzzApp/js/app/MarketTipController.js"></script>
    </body>
</html>