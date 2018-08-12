(window["webpackJsonp"] = window["webpackJsonp"] || []).push([["main"],{

/***/ "./src/$$_lazy_route_resource lazy recursive":
/*!**********************************************************!*\
  !*** ./src/$$_lazy_route_resource lazy namespace object ***!
  \**********************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncaught exception popping up in devtools
	return Promise.resolve().then(function() {
		var e = new Error("Cannot find module '" + req + "'");
		e.code = 'MODULE_NOT_FOUND';
		throw e;
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = "./src/$$_lazy_route_resource lazy recursive";

/***/ }),

/***/ "./src/app/about/about.component.css":
/*!*******************************************!*\
  !*** ./src/app/about/about.component.css ***!
  \*******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/about/about.component.html":
/*!********************************************!*\
  !*** ./src/app/about/about.component.html ***!
  \********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"bg-primary text-center\" id=\"about\">\n    <div class=\"container\">\n        <div class=\"panel panel-default\">\n          \n          <div class=\"panel-body\">\n            <div class=\"table-responsive\" style=\"padding: 25px\">\n              <label style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">HAPPY INVESTMENT. HAPPY TRADING!</label>\n              <div><span style=\" font-size:20px;\">GoToStock is Web and Android mobile App which provides:</span></div>\n                  <ul style=\"color:#2b8341; font-size:20px; margin: 10px; font-weight:normal;\">\n                <li>Daily INTRADAY Calls For Traders</li>\n                <li>MULTIBAGGER Stock Ideas For Investors</li>\n              </ul> \n\n              <label style=\"color: #000000; font-size:20px; font-weight:normal;\">It is very comprehensive Indian stock app for BSE/NSE on Android. This app gives the Intraday / Short Term / Long Term Stock recommendations which helps\n                  traders and investers to buy / sell appropriate stocks. We try to give the Stock suggestions after observing the Market trend of Indian Share Market.</label>\n              \n              \n              <label style=\"color: #2b4b83;  font-size:20px; font-weight:normal;\">Get Indian stock Tips for The Day or Pick Of The Day</label>\n              <ol>\n                <li style=\" font-size:20px;\">Intraday Trading</li>\n                <li style=\" font-size:20px;\">Short Term Investment</li>\n                <li style=\" font-size:20px;\">Long Term Investment</li>\n                <li style=\" font-size:20px;\">BTST</li>\n                <li style=\" font-size:20px;\">Get Instant Notification</li>\n                <li style=\" font-size:20px;\">Live support on WhatsApp and Telegram</li>\n              </ol> \n              \n              <label style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">GoToStock is live now in both Web and Mobile (Android) version</label>\n              <br>\n              <label style=\"color: #2b8341; font-size:20px; font-weight:bold\">Web URL:</label>\n              <a style=\"color: #2b8341; font-size:20px; font-weight:normal;\" href=\"http://www.gotostock.club\">http://www.gotostock.club</a>\n              <br>\n              <label style=\"color: #2b8341; font-size:20px; font-weight:bold\">Mobile Version: <a style=\"color: #2b8341; font-size:20px; font-weight:normal;\" href=\"https://play.google.com/store/apps/details?id=com.gotostock.market_tips\"> Android App Link:</a></label>\n              <br>\n              <a style=\"color: #2b8341; font-size:20px; font-weight:normal;\" href=\"https://play.google.com/store/apps/details?id=com.gotostock.market_tips\">https://play.google.com/store/apps/details?id=com.gotostock.market_tips</a>\n              \n              <label style=\"color: #000000; font-size:20px; font-weight:normal\">Please recommend your friends and help giving good ratings in Google Play Store to make it popular.</label>\n              \n              <label style=\"color: #2b8341; font-size:20px; font-weight:bold\">Newly created Telegram channel: </label>\n              \n              <label style=\"color: #2b8341; font-size:20px; font-weight:normal\"><a style=\"color: #2b8341; font-size:20px; font-weight:normal;\" href=\"https://t.me/gotostock\">  https://t.me/gotostock</a></label>\n              <br>\n              <br>\n              <label style=\"color:#827272; margin: 10px; font-weight:normal\">For any further queries, please mail us at gotostocks@gmail.com</label>\n            </div>\n          </div>\n        </div>\n      </div>\n  </section>"

/***/ }),

/***/ "./src/app/about/about.component.ts":
/*!******************************************!*\
  !*** ./src/app/about/about.component.ts ***!
  \******************************************/
/*! exports provided: AboutComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AboutComponent", function() { return AboutComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var AboutComponent = /** @class */ (function () {
    function AboutComponent() {
    }
    AboutComponent.prototype.ngOnInit = function () {
    };
    AboutComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-about',
            template: __webpack_require__(/*! ./about.component.html */ "./src/app/about/about.component.html"),
            styles: [__webpack_require__(/*! ./about.component.css */ "./src/app/about/about.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], AboutComponent);
    return AboutComponent;
}());



/***/ }),

/***/ "./src/app/api.service.ts":
/*!********************************!*\
  !*** ./src/app/api.service.ts ***!
  \********************************/
/*! exports provided: ApiService */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ApiService", function() { return ApiService; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var rxjs__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! rxjs */ "./node_modules/rxjs/_esm5/index.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var ApiService = /** @class */ (function () {
    function ApiService(httpClient) {
        this.httpClient = httpClient;
        console.log('Hello PeopleServiceProvider Provider');
    }
    ApiService.prototype.load = function () {
        var _this = this;
        console.log('=======Calling Service=====');
        // if (this.data) {
        //   // already loaded data
        //   return Promise.resolve(this.data);
        // }
        // don't have the data yet
        return new Promise(function (resolve) {
            // We're using Angular HTTP provider to request the data,
            // then on the response, it'll map the JSON data to a parsed JS object.
            // Next, we process the data and resolve the promise with the new data.
            _this.httpClient.get('http://www.gotostock.club/api/messages/')
                .subscribe(function (data) {
                // we've got back the raw data, now generate the core schedule data
                // and save the data for later reference
                // this.data = data;
                console.log(data);
                resolve(data);
            }, function (err) {
                console.log('Some Problem');
                resolve(null);
            });
        });
    };
    ApiService = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Injectable"])({
            providedIn: 'root'
        }),
        __metadata("design:paramtypes", [_angular_common_http__WEBPACK_IMPORTED_MODULE_1__["HttpClient"]])
    ], ApiService);
    return ApiService;
}());



/***/ }),

/***/ "./src/app/app.component.css":
/*!***********************************!*\
  !*** ./src/app/app.component.css ***!
  \***********************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/app.component.html":
/*!************************************!*\
  !*** ./src/app/app.component.html ***!
  \************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!--The content below is only a placeholder and can be replaced.-->\n\n<app-header></app-header>\n<!--<app-download></app-download> -->\n\n<router-outlet></router-outlet>\n\n<app-footer></app-footer>\n"

/***/ }),

/***/ "./src/app/app.component.ts":
/*!**********************************!*\
  !*** ./src/app/app.component.ts ***!
  \**********************************/
/*! exports provided: AppComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppComponent", function() { return AppComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};

var AppComponent = /** @class */ (function () {
    function AppComponent() {
        this.title = 'GoToStock';
    }
    AppComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-root',
            template: __webpack_require__(/*! ./app.component.html */ "./src/app/app.component.html"),
            styles: [__webpack_require__(/*! ./app.component.css */ "./src/app/app.component.css")]
        })
    ], AppComponent);
    return AppComponent;
}());



/***/ }),

/***/ "./src/app/app.module.ts":
/*!*******************************!*\
  !*** ./src/app/app.module.ts ***!
  \*******************************/
/*! exports provided: AppModule */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "AppModule", function() { return AppModule; });
/* harmony import */ var _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/platform-browser */ "./node_modules/@angular/platform-browser/fesm5/platform-browser.js");
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_forms__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! @angular/forms */ "./node_modules/@angular/forms/fesm5/forms.js");
/* harmony import */ var _angular_router__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! @angular/router */ "./node_modules/@angular/router/fesm5/router.js");
/* harmony import */ var _angular_common_http__WEBPACK_IMPORTED_MODULE_4__ = __webpack_require__(/*! @angular/common/http */ "./node_modules/@angular/common/fesm5/http.js");
/* harmony import */ var _app_component__WEBPACK_IMPORTED_MODULE_5__ = __webpack_require__(/*! ./app.component */ "./src/app/app.component.ts");
/* harmony import */ var _header_header_component__WEBPACK_IMPORTED_MODULE_6__ = __webpack_require__(/*! ./header/header.component */ "./src/app/header/header.component.ts");
/* harmony import */ var _footer_footer_component__WEBPACK_IMPORTED_MODULE_7__ = __webpack_require__(/*! ./footer/footer.component */ "./src/app/footer/footer.component.ts");
/* harmony import */ var _download_download_component__WEBPACK_IMPORTED_MODULE_8__ = __webpack_require__(/*! ./download/download.component */ "./src/app/download/download.component.ts");
/* harmony import */ var _picture_picture_component__WEBPACK_IMPORTED_MODULE_9__ = __webpack_require__(/*! ./picture/picture.component */ "./src/app/picture/picture.component.ts");
/* harmony import */ var _contact_contact_component__WEBPACK_IMPORTED_MODULE_10__ = __webpack_require__(/*! ./contact/contact.component */ "./src/app/contact/contact.component.ts");
/* harmony import */ var _home_home_component__WEBPACK_IMPORTED_MODULE_11__ = __webpack_require__(/*! ./home/home.component */ "./src/app/home/home.component.ts");
/* harmony import */ var _tutorial_tutorial_component__WEBPACK_IMPORTED_MODULE_12__ = __webpack_require__(/*! ./tutorial/tutorial.component */ "./src/app/tutorial/tutorial.component.ts");
/* harmony import */ var _about_about_component__WEBPACK_IMPORTED_MODULE_13__ = __webpack_require__(/*! ./about/about.component */ "./src/app/about/about.component.ts");
/* harmony import */ var _disclaimer_disclaimer_component__WEBPACK_IMPORTED_MODULE_14__ = __webpack_require__(/*! ./disclaimer/disclaimer.component */ "./src/app/disclaimer/disclaimer.component.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};















var appRoutes = [
    { path: '', component: _home_home_component__WEBPACK_IMPORTED_MODULE_11__["HomeComponent"] },
    {
        path: 'home',
        component: _home_home_component__WEBPACK_IMPORTED_MODULE_11__["HomeComponent"]
    },
    {
        path: 'tutorial',
        component: _tutorial_tutorial_component__WEBPACK_IMPORTED_MODULE_12__["TutorialComponent"]
    },
    {
        path: 'about',
        component: _about_about_component__WEBPACK_IMPORTED_MODULE_13__["AboutComponent"]
    },
    {
        path: 'disclaimer',
        component: _disclaimer_disclaimer_component__WEBPACK_IMPORTED_MODULE_14__["DisclaimerComponent"]
    },
    {
        path: 'pictures',
        component: _picture_picture_component__WEBPACK_IMPORTED_MODULE_9__["PictureComponent"]
    },
    {
        path: 'contacts',
        component: _contact_contact_component__WEBPACK_IMPORTED_MODULE_10__["ContactComponent"]
    },
    {
        path: 'downloads',
        component: _download_download_component__WEBPACK_IMPORTED_MODULE_8__["DownloadComponent"]
    },
    { path: '**', component: _home_home_component__WEBPACK_IMPORTED_MODULE_11__["HomeComponent"] }
];
var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_1__["NgModule"])({
            declarations: [
                _app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"],
                _picture_picture_component__WEBPACK_IMPORTED_MODULE_9__["PictureComponent"],
                _header_header_component__WEBPACK_IMPORTED_MODULE_6__["HeaderComponent"],
                _footer_footer_component__WEBPACK_IMPORTED_MODULE_7__["FooterComponent"],
                _download_download_component__WEBPACK_IMPORTED_MODULE_8__["DownloadComponent"],
                _contact_contact_component__WEBPACK_IMPORTED_MODULE_10__["ContactComponent"],
                _home_home_component__WEBPACK_IMPORTED_MODULE_11__["HomeComponent"],
                _tutorial_tutorial_component__WEBPACK_IMPORTED_MODULE_12__["TutorialComponent"],
                _about_about_component__WEBPACK_IMPORTED_MODULE_13__["AboutComponent"],
                _disclaimer_disclaimer_component__WEBPACK_IMPORTED_MODULE_14__["DisclaimerComponent"]
            ],
            imports: [
                _angular_platform_browser__WEBPACK_IMPORTED_MODULE_0__["BrowserModule"], _angular_common_http__WEBPACK_IMPORTED_MODULE_4__["HttpClientModule"], _angular_forms__WEBPACK_IMPORTED_MODULE_2__["FormsModule"], _angular_router__WEBPACK_IMPORTED_MODULE_3__["RouterModule"].forRoot(appRoutes, { enableTracing: true } // <-- debugging purposes only)
                )
            ],
            providers: [],
            bootstrap: [_app_component__WEBPACK_IMPORTED_MODULE_5__["AppComponent"]]
        })
    ], AppModule);
    return AppModule;
}());



/***/ }),

/***/ "./src/app/contact/contact.component.css":
/*!***********************************************!*\
  !*** ./src/app/contact/contact.component.css ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/contact/contact.component.html":
/*!************************************************!*\
  !*** ./src/app/contact/contact.component.html ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"bg-primary\" id=\"contact\">\n  <div class=\"container\">\n    <h2>We\n      <i class=\"fa fa-heart\"></i>\n      new friends!</h2>\n    <ul class=\"list-inline list-social\">\n      <li class=\"list-inline-item social-twitter\">\n        <a href=\"#\">\n          <i class=\"fa fa-twitter\"></i>\n        </a>\n      </li>\n      <li class=\"list-inline-item social-facebook\">\n        <a href=\"#\">\n          <i class=\"fa fa-facebook\"></i>\n        </a>\n      </li>\n      <li class=\"list-inline-item social-google-plus\">\n        <a href=\"#\">\n          <i class=\"fa fa-google-plus\"></i>\n        </a>\n      </li>\n    </ul>\n  </div>\n</section>"

/***/ }),

/***/ "./src/app/contact/contact.component.ts":
/*!**********************************************!*\
  !*** ./src/app/contact/contact.component.ts ***!
  \**********************************************/
/*! exports provided: ContactComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "ContactComponent", function() { return ContactComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var ContactComponent = /** @class */ (function () {
    function ContactComponent() {
    }
    ContactComponent.prototype.ngOnInit = function () {
    };
    ContactComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-contact',
            template: __webpack_require__(/*! ./contact.component.html */ "./src/app/contact/contact.component.html"),
            styles: [__webpack_require__(/*! ./contact.component.css */ "./src/app/contact/contact.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], ContactComponent);
    return ContactComponent;
}());



/***/ }),

/***/ "./src/app/disclaimer/disclaimer.component.css":
/*!*****************************************************!*\
  !*** ./src/app/disclaimer/disclaimer.component.css ***!
  \*****************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/disclaimer/disclaimer.component.html":
/*!******************************************************!*\
  !*** ./src/app/disclaimer/disclaimer.component.html ***!
  \******************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"bg-primary text-center\" id=\"disclaimer\">\n    <div class=\"container\">\n        <div class=\"panel panel-default\">\n          <!-- Default panel contents -->\n          \n          <div class=\"panel-body\">\n            <div class=\"table-responsive\"\n              style=\"font-weight: normal\">\n              <label style=\"color: #2b8341; font-size: 16px; font-weight: normal;\">According\n                to SEBI guidelines: We are Not SEBI Registered. GoToStock\n                Site/Application has been designed for informational and\n                educational purposes only and does not constitute an offer to sell\n                nor a solicitation of an offer to buy any security / stocks which\n                may be referenced upon the web site/Application. The services and\n                information provided through this web site/Application are for\n                personal, non-commercial, educational use and display. The\n                accuracy, completeness and timeliness of the information contained\n                on this site / Application cannot be guaranteed. We do not give\n                promise of any sure income/return/profit as intraday trading can be\n                risky too. All information given here is largely based on the trend\n                which is highly dynamic in nature and relevant only at a particular\n                point of time. Users are advised to pursue these recommendations\n                only at their own risk and should consult their personal investment\n                advisor before making investment decisions. We are not liable and\n                we will not take any responsibility for any loss that you incur by\n                trading/investing on our views. Details given here are only for\n                educational purpose only. GoToStock site / Application is not\n                responsible for any losses incurred by acting on the our\n                recommendations or our view. You should be aware of risk in trading\n                using our recommendations. Investors are advised to take the\n                services of a competent 'Investment Adviser', before making any\n                investment decision. The targets expressed are based on analysis\n                and does not guarantee success. The use of this app is at your own\n                risk. *GoToStock* is not responsible for any losses. All data and\n                details given are for educational purpose only.</label> \n                 \n                <label\n                style=\"color: #827272; font-size: 14px; margin: 10px; font-weight: normal\">For\n                any further queries, please mail us at gotostocks@gmail.com</label>\n            </div>\n          </div>\n        </div>\n      </div>\n  </section>"

/***/ }),

/***/ "./src/app/disclaimer/disclaimer.component.ts":
/*!****************************************************!*\
  !*** ./src/app/disclaimer/disclaimer.component.ts ***!
  \****************************************************/
/*! exports provided: DisclaimerComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DisclaimerComponent", function() { return DisclaimerComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var DisclaimerComponent = /** @class */ (function () {
    function DisclaimerComponent() {
    }
    DisclaimerComponent.prototype.ngOnInit = function () {
    };
    DisclaimerComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-disclaimer',
            template: __webpack_require__(/*! ./disclaimer.component.html */ "./src/app/disclaimer/disclaimer.component.html"),
            styles: [__webpack_require__(/*! ./disclaimer.component.css */ "./src/app/disclaimer/disclaimer.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], DisclaimerComponent);
    return DisclaimerComponent;
}());



/***/ }),

/***/ "./src/app/download/download.component.css":
/*!*************************************************!*\
  !*** ./src/app/download/download.component.css ***!
  \*************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/download/download.component.html":
/*!**************************************************!*\
  !*** ./src/app/download/download.component.html ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"bg-primary text-center\" id=\"download\">\n  <div class=\"container\">\n    <div class=\"row\">\n      <div class=\"col-md-8 mx-auto\">\n        <h2 class=\"section-heading\" style=\"font-family: Muli,Helvetica,Arial,sans-serif;\">Discover what all the buzz is about!</h2>\n        <p style=\"font-family: Muli,Helvetica,Arial,sans-serif;\">Our app is available on any mobile device! Download now to get started!</p>\n        <div class=\"badges\">\n          <a class=\"badge-link\" target=\"_blank\" href=\"https://play.google.com/store/apps/details?id=com.gotostock.market_tips\"><img src=\"img/google-play-badge.svg\" alt=\"\"></a>\n        </div>\n      </div>\n    </div>\n  </div>\n</section>"

/***/ }),

/***/ "./src/app/download/download.component.ts":
/*!************************************************!*\
  !*** ./src/app/download/download.component.ts ***!
  \************************************************/
/*! exports provided: DownloadComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "DownloadComponent", function() { return DownloadComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var DownloadComponent = /** @class */ (function () {
    function DownloadComponent() {
    }
    DownloadComponent.prototype.ngOnInit = function () {
    };
    DownloadComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-download',
            template: __webpack_require__(/*! ./download.component.html */ "./src/app/download/download.component.html"),
            styles: [__webpack_require__(/*! ./download.component.css */ "./src/app/download/download.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], DownloadComponent);
    return DownloadComponent;
}());



/***/ }),

/***/ "./src/app/footer/footer.component.css":
/*!*********************************************!*\
  !*** ./src/app/footer/footer.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/footer/footer.component.html":
/*!**********************************************!*\
  !*** ./src/app/footer/footer.component.html ***!
  \**********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<footer>\n  <div class=\"container\">\n    <p>&copy; Your Website 2018. All Rights Reserved.</p>\n    <ul class=\"list-inline\">\n      <li class=\"list-inline-item\">\n        <a href=\"#\">Privacy</a>\n      </li>\n      <li class=\"list-inline-item\">\n        <a href=\"#\">Terms</a>\n      </li>\n      <li class=\"list-inline-item\">\n        <a href=\"#\">FAQ</a>\n      </li>\n    </ul>\n  </div>\n</footer>\n"

/***/ }),

/***/ "./src/app/footer/footer.component.ts":
/*!********************************************!*\
  !*** ./src/app/footer/footer.component.ts ***!
  \********************************************/
/*! exports provided: FooterComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "FooterComponent", function() { return FooterComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var FooterComponent = /** @class */ (function () {
    function FooterComponent() {
    }
    FooterComponent.prototype.ngOnInit = function () {
    };
    FooterComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-footer',
            template: __webpack_require__(/*! ./footer.component.html */ "./src/app/footer/footer.component.html"),
            styles: [__webpack_require__(/*! ./footer.component.css */ "./src/app/footer/footer.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], FooterComponent);
    return FooterComponent;
}());



/***/ }),

/***/ "./src/app/header/header.component.css":
/*!*********************************************!*\
  !*** ./src/app/header/header.component.css ***!
  \*********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/header/header.component.html":
/*!**********************************************!*\
  !*** ./src/app/header/header.component.html ***!
  \**********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<!-- Navigation -->\n<nav class=\"navbar navbar-expand-lg navbar-light fixed-top\" id=\"mainNav\">\n  <div class=\"container\">\n    <a class=\"navbar-brand js-scroll-trigger\" href=\"#page-top\">GoToStock</a>\n    <button class=\"navbar-toggler navbar-toggler-right\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n      Menu\n      <i class=\"fa fa-bars\"></i>\n    </button>\n    <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n      <ul class=\"navbar-nav ml-auto\">\n          <li class=\"nav-item\">\n              <a class=\"nav-link js-scroll-trigger\" routerLink=\"/home\" routerLinkActive=\"active\">Home</a>\n            </li>\n            <li class=\"nav-item\">\n                <a class=\"nav-link js-scroll-trigger\" routerLink=\"/tutorial\" routerLinkActive=\"active\">Tutorial</a>\n              </li>\n        <li class=\"nav-item\">\n          <a class=\"nav-link js-scroll-trigger\" routerLink=\"/downloads\" routerLinkActive=\"active\">Downloads</a>\n        </li>\n        <li class=\"nav-item\">\n            <a class=\"nav-link js-scroll-trigger\" routerLink=\"/about\" routerLinkActive=\"active\">About</a>\n          </li>\n          <li class=\"nav-item\">\n              <a class=\"nav-link js-scroll-trigger\" routerLink=\"/disclaimer\" routerLinkActive=\"active\">Disclaimer</a>\n            </li>\n      <!-- <li class=\"nav-item\">\n          <a class=\"nav-link js-scroll-trigger\" routerLink=\"/pictures\" routerLinkActive=\"active\">Pictures</a>\n        </li>\n        <li class=\"nav-item\">\n          <a class=\"nav-link js-scroll-trigger\" routerLink=\"/contacts\" routerLinkActive=\"active\">Contacts</a>\n        </li> -->\n      </ul>\n    </div>\n  </div>\n</nav>"

/***/ }),

/***/ "./src/app/header/header.component.ts":
/*!********************************************!*\
  !*** ./src/app/header/header.component.ts ***!
  \********************************************/
/*! exports provided: HeaderComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HeaderComponent", function() { return HeaderComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var HeaderComponent = /** @class */ (function () {
    function HeaderComponent() {
    }
    HeaderComponent.prototype.ngOnInit = function () {
    };
    HeaderComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-header',
            template: __webpack_require__(/*! ./header.component.html */ "./src/app/header/header.component.html"),
            styles: [__webpack_require__(/*! ./header.component.css */ "./src/app/header/header.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], HeaderComponent);
    return HeaderComponent;
}());



/***/ }),

/***/ "./src/app/home/home.component.css":
/*!*****************************************!*\
  !*** ./src/app/home/home.component.css ***!
  \*****************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/home/home.component.html":
/*!******************************************!*\
  !*** ./src/app/home/home.component.html ***!
  \******************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"bg-primary text-center\" id=\"home\">\n    <div class=\"container\">\n        <div class=\"panel panel-default\" style=\"text-align: center\">\n            <!-- Default panel contents -->\n            <div class=\"panel-heading\"><span class=\"lead\">GoToStock (Happy Investment. Happy Trading!)</span></div>\n            <ul style=\"color:#2b8341; font-size:16px; margin: 10px; font-weight:bold;\">\n                <div>Daily INTRADAY Calls For Traders</div>\n                <div>MULTIBAGGER Stock Ideas For Investors</div>\n            </ul>  \n            \n        <div class=\"panel-body\">\n          <div class=\"table-responsive\">\n            \n            <table style=\"padding-left: 12px\" class=\"table table-hover\" id=\"table_messages\">\n                    <tbody>\n                    <tr *ngFor=\"let u of peoples\">\n                        <td align=\"center\" style=\"font-size: 12px;color: #2b8341; font-weight:normal; padding-left: 12px;\"><a style=\"color: #337ab7;\" href=\"{{u.url}}\" target=\"_blank\" ><b style=\"font-size: 14px\">{{u.content}}</b></a></td>\n                    </tr>\n                    <tr>\n                        <td style=\"border-top: 1px !important\" align=\"center\" id=\"link_bar\">\n                             <a  href=\"https://api.whatsapp.com/send?phone=916361059258&text=REGISTERWEB\" target=\"_blank\"><img src=\"img/click_here_message.gif\"></a>\n                            </td>\n                        <tr>  \n                        <tr>  \n                            <td align=\"center\" style=\"border-top: 1px !important\">\n                            <a href=\"https://zerodha.com/open-account?c=ZMPAVT\" target=\"_blank\"><img src=\"img/open-zerodha-account.gif\"></a>\n                          </td>\n                    </tr>\n                    \n                    <tr>  \n                            <td align=\"center\" style=\"border-top: 1px !important\" >\n                            <a href=\"http://upstox.com/open-account/?f=99JV\" target=\"_blank\"><img src=\"img/open-upstox-account.gif\"></a>\n                          </td>\n                    </tr>\n                    \n                    </tbody>\n                </table>\n            \n            <label style=\"padding-left:12px;\" class=\"control-lable\">*Note: Only members who have added number (+91-6361059258) to their phone's address book will receive broadcast message.</label>\n            \n          <!-- \t<div ng-controller=\"Hello\">\n              <b style=\"font-family: 'Oswald', sans-serif;color: #0000FF; size: 30px; padding: 10px;\">Welcome Go To Stock</b>\n              <p>The ID is {{greeting.id}}</p>\n              <p>The content is {{greeting.content}}</p>\n            </div> -->\n          \n            \n            <!-- <div class=\"row\">\n              <div class=\"form-group col-md-12\">\n                <label class=\"col-md-2 control-lable\">STOCK NAME :</label>\n                <div class=\"col-md-7\">\n                  <input type=\"text\" ng-model=\"marketTip.name\"\n                    class=\"form-control input-sm\" placeholder=\"Enter Stock Name\" />\n                </div>\n              </div>\n            </div> -->\n    \n            <!-- <div class=\"row\">\n              <div class=\"form-group col-md-12\">\n                <label class=\"col-md-2 control-lable\">CALL TYPE :</label>\n                <div class=\"col-md-7\">\n                  <input type=\"text\" ng-model=\"marketTip.callType\"\n                    class=\"form-control input-sm\" placeholder=\"Enter Buy/Sell\" />\n                </div>\n              </div>\n            </div> -->\n    \n            <!-- <div class=\"row\">\n              <div class=\"form-group col-md-12\">\n                <label class=\"col-md-2 control-lable\">STATUS :</label>\n                <div class=\"col-md-7\">\n                  <input type=\"text\" ng-model=\"marketTip.status\"\n                    class=\"form-control input-sm\" placeholder=\"Enter Status (Active/Target Met)\" />\n                </div>\n              </div>\n            </div> -->\n            <!-- <div style=\"padding-left: 12px\"><span style=\"font-size: 20px;\">Recommended Stocks</span></div>\n                <table class=\"table table-hover\" id=\"table_list\">\n                    <thead>\n                    <tr>\n                      <th>REC ID</th>\n                      <th>DATE</th>\n                        <th>STOCK</th>\n                        <th>CALL</th>\n                        <th>CURRENT</th>\n                        <th>TRIGGER</th>\n                        <th>TARGET</th>\n                         <th>SL</th>\n                          <th>U/D</th>\n                          <th>TIME</th>\n                           <th>STATUS</th>\n                    </tr>\n                    </thead>\n                    <tbody>\n                    <tr ng-repeat=\"u in ctrl.getAllActiveMarketTips() | filter: marketTip | orderBy:'-id'\">\n                        <td>{{u.id}}</td>\n                        <td>{{u.callDate}}</td>\n                        <td>{{u.name}}</td>\n                         <td>{{u.callType}}</td>\n                         <td>{{u.currentPrice | limitTo:7}}</td>\n                        <td>{{u.triggerPrice | limitTo:7}}</td>\n                        <td>{{u.targetPrice | limitTo:7}}</td>\n                        <td>{{u.stopLoss | limitTo:5}}</td>\n                        <td>{{u.profit | limitTo:5}}%</td>\n                        <td>{{u.duration}}</td>\n                        <td>{{u.status}}</td>\n                    </tr>\n                    </tbody>\n                </table>\t -->\t\n          </div>\n        </div>\n        </div>\n    </div>\n</section>"

/***/ }),

/***/ "./src/app/home/home.component.ts":
/*!****************************************!*\
  !*** ./src/app/home/home.component.ts ***!
  \****************************************/
/*! exports provided: HomeComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "HomeComponent", function() { return HomeComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _api_service__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! ../api.service */ "./src/app/api.service.ts");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var HomeComponent = /** @class */ (function () {
    function HomeComponent(apiService) {
        this.apiService = apiService;
        this.contacts = [];
    }
    HomeComponent.prototype.ngOnInit = function () {
        this.loadPeople();
    };
    HomeComponent.prototype.loadPeople = function () {
        var _this = this;
        this.apiService.load()
            .then(function (data) {
            _this.peoples = data;
        });
    };
    HomeComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-home',
            template: __webpack_require__(/*! ./home.component.html */ "./src/app/home/home.component.html"),
            styles: [__webpack_require__(/*! ./home.component.css */ "./src/app/home/home.component.css")]
        }),
        __metadata("design:paramtypes", [_api_service__WEBPACK_IMPORTED_MODULE_1__["ApiService"]])
    ], HomeComponent);
    return HomeComponent;
}());



/***/ }),

/***/ "./src/app/picture/picture.component.css":
/*!***********************************************!*\
  !*** ./src/app/picture/picture.component.css ***!
  \***********************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/picture/picture.component.html":
/*!************************************************!*\
  !*** ./src/app/picture/picture.component.html ***!
  \************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"features bg-primary\" id=\"features\">\n  <div class=\"container\">\n    <div class=\"section-heading text-center\">\n      <h2>Unlimited Features, Unlimited Fun</h2>\n      <p class=\"text-muted\">Check out what you can do with this app theme!</p>\n      <hr>\n    </div>\n    <div class=\"row\">\n      <div class=\"col-lg-4 my-auto\">\n        <div class=\"device-container\">\n          <div class=\"device-mockup iphone6_plus portrait white\">\n            <div class=\"device\">\n              <div class=\"screen\">\n                <!-- Demo image for screen mockup, you can put an image here, some HTML, an animation, video, or anything else! -->\n                <img src=\"img/demo-screen-1.jpg\" class=\"img-fluid\" alt=\"\">\n              </div>\n              <div class=\"button\">\n                <!-- You can hook the \"home button\" to some JavaScript events or just remove it -->\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n      <div class=\"col-lg-8 my-auto\">\n        <div class=\"container-fluid\">\n          <div class=\"row\">\n            <div class=\"col-lg-6\">\n              <div class=\"feature-item\">\n                <i class=\"icon-screen-smartphone text-primary\"></i>\n                <h3>Device Mockups</h3>\n                <p class=\"text-muted\">Ready to use HTML/CSS device mockups, no Photoshop required!</p>\n              </div>\n            </div>\n            <div class=\"col-lg-6\">\n              <div class=\"feature-item\">\n                <i class=\"icon-camera text-primary\"></i>\n                <h3>Flexible Use</h3>\n                <p class=\"text-muted\">Put an image, video, animation, or anything else in the screen!</p>\n              </div>\n            </div>\n          </div>\n          <div class=\"row\">\n            <div class=\"col-lg-6\">\n              <div class=\"feature-item\">\n                <i class=\"icon-present text-primary\"></i>\n                <h3>Free to Use</h3>\n                <p class=\"text-muted\">As always, this theme is free to download and use for any purpose!</p>\n              </div>\n            </div>\n            <div class=\"col-lg-6\">\n              <div class=\"feature-item\">\n                <i class=\"icon-lock-open text-primary\"></i>\n                <h3>Open Source</h3>\n                <p class=\"text-muted\">Since this theme is MIT licensed, you can use it commercially!</p>\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n    </div>\n  </div>\n</section>"

/***/ }),

/***/ "./src/app/picture/picture.component.ts":
/*!**********************************************!*\
  !*** ./src/app/picture/picture.component.ts ***!
  \**********************************************/
/*! exports provided: PictureComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "PictureComponent", function() { return PictureComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var PictureComponent = /** @class */ (function () {
    function PictureComponent() {
        this.description = 'This is a nice movie';
        this.searchMovie = 'Any';
        this.url = 'http://photo.elcinema.com.s3.amazonaws.com/uploads/_315x420_c751f6639f1bfdbde98710532d5046686987434dcc483b8cb09d75464f4a0f32.jpg';
        this.movie = {
            url: "http://photo.elcinema.com.s3.amazonaws.com/uploads/_315x420_c751f6639f1bfdbde98710532d5046686987434dcc483b8cb09d75464f4a0f32.jpg"
        };
    }
    PictureComponent.prototype.ngOnInit = function () {
    };
    PictureComponent.prototype.buyTicket = function () {
        alert('Buying Ticket');
    };
    PictureComponent.prototype.valueChange = function (value) {
        console.log("====" + value);
    };
    PictureComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-picture',
            template: __webpack_require__(/*! ./picture.component.html */ "./src/app/picture/picture.component.html"),
            styles: [__webpack_require__(/*! ./picture.component.css */ "./src/app/picture/picture.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], PictureComponent);
    return PictureComponent;
}());



/***/ }),

/***/ "./src/app/tutorial/tutorial.component.css":
/*!*************************************************!*\
  !*** ./src/app/tutorial/tutorial.component.css ***!
  \*************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = ""

/***/ }),

/***/ "./src/app/tutorial/tutorial.component.html":
/*!**************************************************!*\
  !*** ./src/app/tutorial/tutorial.component.html ***!
  \**************************************************/
/*! no static exports found */
/***/ (function(module, exports) {

module.exports = "<section class=\"download bg-primary text-center\" id=\"tutorial\">\n    <div class=\"container\">\n        <div class=\"panel panel-default\">\n          \n          <div class=\"panel-body\">\n            <div class=\"table-responsive\" style=\"padding: 12px\">\n              <h2 style=\"padding-left: 10px; font-size:30px; font-weight:bold;\">How to use GoToStock EFFICIENTLY?</h2>\n              <ul style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">\n                <li style=\"color: #2b8341; font-size:20px; font-weight:normal;\">Visit the mobile App in the morning to check if new tips are added.</li>\n                <li style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">For Intraday traders: Usually Tips are added at 10:00 AM IST after looking into the Market Trend</li>\n                <li style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">Search with the STATUS and CALL TYPE. If STATUS is Active and DATE is within the range, then only trade / invest on the recommendation based on CALL TYPE</li>\n                <li style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">Investors can search with duration for which they want to invest</li>\n                <li style=\"color: #2b8341; font-size:20px; font-weight:normal;\">Make use of Notification which comes whenever new important Tips are added in the App</li>\n                \n                \n                <li style=\"color: #2b4b83; font-size:20px; font-weight:normal;\">Get added to the WhatsApp and Telegram Link by clicking on the below link so as to get the updates on the spot</li>\n                <li style=\"color: #2b8341; font-size:20px; font-weight:bold;\">*Note: Only members who have added number (+91-6361059258) to their phone's address book will receive broadcast message.</li>\n              </ul>\n              <br>\n              <br>  \n              <div align=\"center\" style=\"padding-left: 10px\" id=\"link_bar\"> <a style=\"font-weight:bold;\" href=\"https://api.whatsapp.com/send?phone=916361059258&text=REGISTERWEB\" target=\"_blank\"><img src=\"img/click_here_message.gif\"></a> </div>\n                <br>\n                <br>\n                <label style=\"color:#827272; margin: 10px; font-weight:normal\">For any further queries, please mail us at gotostocks@gmail.com</label>\n            </div>\n          </div>\n        </div>\n      </div>\n</section>\n"

/***/ }),

/***/ "./src/app/tutorial/tutorial.component.ts":
/*!************************************************!*\
  !*** ./src/app/tutorial/tutorial.component.ts ***!
  \************************************************/
/*! exports provided: TutorialComponent */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "TutorialComponent", function() { return TutorialComponent; });
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
var __decorate = (undefined && undefined.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (undefined && undefined.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};

var TutorialComponent = /** @class */ (function () {
    function TutorialComponent() {
    }
    TutorialComponent.prototype.ngOnInit = function () {
    };
    TutorialComponent = __decorate([
        Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["Component"])({
            selector: 'app-tutorial',
            template: __webpack_require__(/*! ./tutorial.component.html */ "./src/app/tutorial/tutorial.component.html"),
            styles: [__webpack_require__(/*! ./tutorial.component.css */ "./src/app/tutorial/tutorial.component.css")]
        }),
        __metadata("design:paramtypes", [])
    ], TutorialComponent);
    return TutorialComponent;
}());



/***/ }),

/***/ "./src/environments/environment.ts":
/*!*****************************************!*\
  !*** ./src/environments/environment.ts ***!
  \*****************************************/
/*! exports provided: environment */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "environment", function() { return environment; });
// This file can be replaced during build by using the `fileReplacements` array.
// `ng build ---prod` replaces `environment.ts` with `environment.prod.ts`.
// The list of file replacements can be found in `angular.json`.
var environment = {
    production: false
};
/*
 * In development mode, to ignore zone related error stack frames such as
 * `zone.run`, `zoneDelegate.invokeTask` for easier debugging, you can
 * import the following file, but please comment it out in production mode
 * because it will have performance impact when throw error
 */
// import 'zone.js/dist/zone-error';  // Included with Angular CLI.


/***/ }),

/***/ "./src/main.ts":
/*!*********************!*\
  !*** ./src/main.ts ***!
  \*********************/
/*! no exports provided */
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
__webpack_require__.r(__webpack_exports__);
/* harmony import */ var _angular_core__WEBPACK_IMPORTED_MODULE_0__ = __webpack_require__(/*! @angular/core */ "./node_modules/@angular/core/fesm5/core.js");
/* harmony import */ var _angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__ = __webpack_require__(/*! @angular/platform-browser-dynamic */ "./node_modules/@angular/platform-browser-dynamic/fesm5/platform-browser-dynamic.js");
/* harmony import */ var _app_app_module__WEBPACK_IMPORTED_MODULE_2__ = __webpack_require__(/*! ./app/app.module */ "./src/app/app.module.ts");
/* harmony import */ var _environments_environment__WEBPACK_IMPORTED_MODULE_3__ = __webpack_require__(/*! ./environments/environment */ "./src/environments/environment.ts");




if (_environments_environment__WEBPACK_IMPORTED_MODULE_3__["environment"].production) {
    Object(_angular_core__WEBPACK_IMPORTED_MODULE_0__["enableProdMode"])();
}
Object(_angular_platform_browser_dynamic__WEBPACK_IMPORTED_MODULE_1__["platformBrowserDynamic"])().bootstrapModule(_app_app_module__WEBPACK_IMPORTED_MODULE_2__["AppModule"])
    .catch(function (err) { return console.log(err); });


/***/ }),

/***/ 0:
/*!***************************!*\
  !*** multi ./src/main.ts ***!
  \***************************/
/*! no static exports found */
/***/ (function(module, exports, __webpack_require__) {

module.exports = __webpack_require__(/*! E:\Perso\IONIC\work\angular\my-project\src\main.ts */"./src/main.ts");


/***/ })

},[[0,"runtime","vendor"]]]);
//# sourceMappingURL=main.js.map