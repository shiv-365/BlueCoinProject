webpackJsonp([4],{

/***/ 101:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return Tab4Page; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(28);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


/**
 * Generated class for the Tab4Page page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var Tab4Page = /** @class */ (function () {
    function Tab4Page(navCtrl, navParams) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
    }
    Tab4Page.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad Tab4Page');
    };
    Tab4Page = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-tab4',template:/*ion-inline-start:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/tab4/tab4.html"*/'<!--\n  Generated template for the Tab4Page page.\n\n  See http://ionicframework.com/docs/components/#navigation for more info on\n  Ionic pages and navigation.\n-->\n<ion-header>\n\n  <ion-navbar>\n    <ion-title>tab4</ion-title>\n  </ion-navbar>\n\n</ion-header>\n\n\n<ion-content padding>\n\n</ion-content>\n'/*ion-inline-end:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/tab4/tab4.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavParams */]])
    ], Tab4Page);
    return Tab4Page;
}());

//# sourceMappingURL=tab4.js.map

/***/ }),

/***/ 102:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TransactionPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(28);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__providers_transaction_service__ = __webpack_require__(50);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



/**
 * Generated class for the TransactionPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var TransactionPage = /** @class */ (function () {
    function TransactionPage(navCtrl, navParams, transactionService) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        this.transactionService = transactionService;
        this.getAllTransactions();
    }
    TransactionPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad TransactionPage');
    };
    TransactionPage.prototype.getAllTransactions = function () {
        var _this = this;
        this.transactionService.getAllTransactions().subscribe(function (transactions) {
            _this.transactions = transactions;
        });
    };
    TransactionPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-transaction',template:/*ion-inline-start:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/transaction/transaction.html"*/'<!--\n  Generated template for the TransactionPage page.\n\n  See http://ionicframework.com/docs/components/#navigation for more info on\n  Ionic pages and navigation.\n-->\n<ion-header>\n\n  <ion-navbar>\n    <ion-title>Transaction</ion-title>\n  </ion-navbar>\n\n</ion-header>\n\n\n<ion-content padding>\n\n    <ion-list>\n        <ion-item-sliding *ngFor="let transaction of transactions">\n          <ion-item>\n            <ion-card>\n                <ion-card-header>\n                  Transaction #: {{transaction.transactionId}}\n                </ion-card-header>\n                <ion-card-content>\n                  <div>Sender: {{ transaction.sender }}</div>\n                  <div>Recipient: {{ transaction.recipient }}</div>\n                  <div>Amount: {{ transaction.amount }}</div>\n                </ion-card-content>\n            </ion-card>\n          </ion-item>\n        </ion-item-sliding>\n      </ion-list>\n\n</ion-content>\n'/*ion-inline-end:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/transaction/transaction.html"*/,
        }),
        __metadata("design:paramtypes", [typeof (_a = typeof __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* NavController */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* NavController */]) === "function" && _a || Object, typeof (_b = typeof __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavParams */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavParams */]) === "function" && _b || Object, typeof (_c = typeof __WEBPACK_IMPORTED_MODULE_2__providers_transaction_service__["a" /* TransactionService */] !== "undefined" && __WEBPACK_IMPORTED_MODULE_2__providers_transaction_service__["a" /* TransactionService */]) === "function" && _c || Object])
    ], TransactionPage);
    return TransactionPage;
    var _a, _b, _c;
}());

//# sourceMappingURL=transaction.js.map

/***/ }),

/***/ 103:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TabsPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__home_home__ = __webpack_require__(159);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__wallet_wallet__ = __webpack_require__(104);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__transaction_transaction__ = __webpack_require__(102);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__tab4_tab4__ = __webpack_require__(101);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var TabsPage = /** @class */ (function () {
    function TabsPage() {
        this.homePage = __WEBPACK_IMPORTED_MODULE_1__home_home__["a" /* HomePage */];
        this.walletPage = __WEBPACK_IMPORTED_MODULE_2__wallet_wallet__["a" /* WalletPage */];
        this.transactionPage = __WEBPACK_IMPORTED_MODULE_3__transaction_transaction__["a" /* TransactionPage */];
        this.tab4 = __WEBPACK_IMPORTED_MODULE_4__tab4_tab4__["a" /* Tab4Page */];
    }
    TabsPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-tabs',template:/*ion-inline-start:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/tabs/tabs.html"*/'<ion-tabs>\n  <ion-tab [root]="homePage" tabTitle="ZipCoin-BlockChain" tabIcon="link"></ion-tab>\n  <ion-tab [root]="walletPage" tabTitle="ZipCoin Wallet" tabIcon="cash"></ion-tab>\n  <ion-tab [root]="transactionPage" tabTitle="ZipCoin Transactions" tabIcon="contacts"></ion-tab>\n  <ion-tab [root]="tab4" tabTitle="Ziptab" tabIcon="star"></ion-tab>\n\n</ion-tabs>'/*ion-inline-end:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/tabs/tabs.html"*/,
        }),
        __metadata("design:paramtypes", [])
    ], TabsPage);
    return TabsPage;
}());

//# sourceMappingURL=tabs.js.map

/***/ }),

/***/ 104:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return WalletPage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(28);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__providers_transaction_service__ = __webpack_require__(50);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



/**
 * Generated class for the WalletPage page.
 *
 * See https://ionicframework.com/docs/components/#navigation for more info on
 * Ionic pages and navigation.
 */
var WalletPage = /** @class */ (function () {
    function WalletPage(navCtrl, navParams, transactionService) {
        this.navCtrl = navCtrl;
        this.navParams = navParams;
        this.transactionService = transactionService;
    }
    WalletPage.prototype.ionViewDidLoad = function () {
        console.log('ionViewDidLoad WalletPage');
    };
    WalletPage.prototype.createTransaction = function () {
        this.transactionService.createTransaction(this.transaction);
    };
    WalletPage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-wallet',template:/*ion-inline-start:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/wallet/wallet.html"*/'<!--\n  Generated template for the WalletPage page.\n\n  See http://ionicframework.com/docs/components/#navigation for more info on\n  Ionic pages and navigation.\n-->\n<ion-header>\n\n  <ion-navbar>\n    <ion-title>Wallet</ion-title>\n  </ion-navbar>\n\n</ion-header>\n\n\n<ion-content padding>\n\n\n  \n  <ion-item>\n      <ion-label>Name</ion-label>\n      <ion-select [(ngModel)]="name">\n        <ion-option value="navya">navya</ion-option>\n        <ion-option value="aleena">aleena</ion-option>\n      </ion-select>\n     </ion-item>\n     <ion-item>\n        <ion-label>current balance</ion-label>\n        <ion-input></ion-input>\n      </ion-item>\n      <ion-item>\n          <ion-label>Public Key</ion-label>\n          <ion-input></ion-input>\n        </ion-item>\n      <br>\n      <br>\n      <div class = "bar bar-subheader bar-assertive">\n          <h2 class = "title">Payment</h2>\n       </div>\n       <ion-item>\n          <ion-label>From</ion-label>\n          <ion-select [(ngModel)]="name">\n            <ion-option value="navya">navya</ion-option>\n            <ion-option value="aleena">aleena</ion-option>\n          </ion-select>\n         </ion-item>\n         <ion-item>\n            <ion-label>To</ion-label>\n            <ion-select [(ngModel)]="to">\n              <ion-option value="navya">navya</ion-option>\n              <ion-option value="aleena">aleena</ion-option>\n            </ion-select>\n           </ion-item>\n      \n          <ion-item>\n              <ion-label>Amount</ion-label>\n              <ion-input></ion-input>\n            </ion-item>\n            <br>\n            <button ion-button>Pay</button>\n</ion-content>\n'/*ion-inline-end:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/wallet/wallet.html"*/,
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* NavController */], __WEBPACK_IMPORTED_MODULE_1_ionic_angular__["f" /* NavParams */], __WEBPACK_IMPORTED_MODULE_2__providers_transaction_service__["a" /* TransactionService */]])
    ], WalletPage);
    return WalletPage;
}());

//# sourceMappingURL=wallet.js.map

/***/ }),

/***/ 116:
/***/ (function(module, exports) {

function webpackEmptyAsyncContext(req) {
	// Here Promise.resolve().then() is used instead of new Promise() to prevent
	// uncatched exception popping up in devtools
	return Promise.resolve().then(function() {
		throw new Error("Cannot find module '" + req + "'.");
	});
}
webpackEmptyAsyncContext.keys = function() { return []; };
webpackEmptyAsyncContext.resolve = webpackEmptyAsyncContext;
module.exports = webpackEmptyAsyncContext;
webpackEmptyAsyncContext.id = 116;

/***/ }),

/***/ 158:
/***/ (function(module, exports, __webpack_require__) {

var map = {
	"../pages/tab4/tab4.module": [
		280,
		3
	],
	"../pages/tabs/tabs.module": [
		282,
		2
	],
	"../pages/transaction/transaction.module": [
		281,
		1
	],
	"../pages/wallet/wallet.module": [
		283,
		0
	]
};
function webpackAsyncContext(req) {
	var ids = map[req];
	if(!ids)
		return Promise.reject(new Error("Cannot find module '" + req + "'."));
	return __webpack_require__.e(ids[1]).then(function() {
		return __webpack_require__(ids[0]);
	});
};
webpackAsyncContext.keys = function webpackAsyncContextKeys() {
	return Object.keys(map);
};
webpackAsyncContext.id = 158;
module.exports = webpackAsyncContext;

/***/ }),

/***/ 159:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return HomePage; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(28);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__providers_block_service__ = __webpack_require__(160);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};



var HomePage = /** @class */ (function () {
    function HomePage(navCtrl, blockService) {
        this.navCtrl = navCtrl;
        this.blockService = blockService;
        this.block = {};
        this.getAllBlocks();
    }
    HomePage.prototype.getBlock = function (id) {
        var _this = this;
        this.blockService.getBlock(id).subscribe(function (block) {
            _this.block = block;
        });
    };
    HomePage.prototype.getAllBlocks = function () {
        var _this = this;
        this.blockService.getAllBlocks().subscribe(function (blocks) {
            _this.blocks = blocks;
        });
    };
    HomePage.prototype.getMinedBlock = function (id) {
        var _this = this;
        this.blockService.getMinedBlock(id).subscribe(function (minedBlock) {
            _this.block = minedBlock;
        });
    };
    HomePage = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({
            selector: 'page-home',template:/*ion-inline-start:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/home/home.html"*/'<ion-header>\n  <ion-navbar>\n    <ion-title>\n      ZipCoin BlockChain\n    </ion-title>\n  </ion-navbar>\n</ion-header>\n\n<ion-content padding>\n\n  <ion-list>\n    <ion-item-sliding *ngFor="let block of blocks">\n      <ion-item>\n        <ion-card>\n            <ion-card-header>\n              Block #: {{block.blockNumber}}\n            </ion-card-header>\n            <ion-card-content>\n              <div>Nonce: {{ block.nonce }}</div>\n              <div>Data: {{ block.transactionList }}</div>\n              <div>Previous Hash: {{ block.previousHash }}</div>\n              <div>Current Hash: {{ block.currentHash }}</div>\n              <button ion-button (click)="getMinedBlock(block.id)">Mine</button>\n            </ion-card-content>\n        </ion-card>\n      </ion-item>\n    </ion-item-sliding>\n  </ion-list>\n\n</ion-content>'/*ion-inline-end:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/pages/home/home.html"*/
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["e" /* NavController */], __WEBPACK_IMPORTED_MODULE_2__providers_block_service__["a" /* BlockService */]])
    ], HomePage);
    return HomePage;
}());

//make payment
//block view
//2 pull down list of username and pay other user "blank zips"
// transaction are order by date
// pay tab how many coins``
// 4 tabs block,pay,  
//# sourceMappingURL=home.js.map

/***/ }),

/***/ 160:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return BlockService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_common_http__ = __webpack_require__(78);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(0);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var BlockService = /** @class */ (function () {
    function BlockService(http) {
        this.http = http;
        this.API = 'http://localhost:8080/api/v1';
        this.BLOCK_API = this.API + '/blocks';
    }
    BlockService.prototype.getBlock = function (id) {
        return this.http.get(this.BLOCK_API + '/' + id);
    };
    BlockService.prototype.getMinedBlock = function (id) {
        return this.http.get(this.BLOCK_API + '/' + id + '/' + 'mine');
    };
    BlockService.prototype.getAllBlocks = function () {
        return this.http.get(this.BLOCK_API);
    };
    BlockService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_0__angular_common_http__["a" /* HttpClient */]])
    ], BlockService);
    return BlockService;
}());

//# sourceMappingURL=block-service.js.map

/***/ }),

/***/ 204:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
Object.defineProperty(__webpack_exports__, "__esModule", { value: true });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser_dynamic__ = __webpack_require__(205);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__app_module__ = __webpack_require__(225);


Object(__WEBPACK_IMPORTED_MODULE_0__angular_platform_browser_dynamic__["a" /* platformBrowserDynamic */])().bootstrapModule(__WEBPACK_IMPORTED_MODULE_1__app_module__["a" /* AppModule */]);
//# sourceMappingURL=main.js.map

/***/ }),

/***/ 225:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return AppModule; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__ = __webpack_require__(31);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2_ionic_angular__ = __webpack_require__(28);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__ = __webpack_require__(200);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__ionic_native_status_bar__ = __webpack_require__(203);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_5__app_component__ = __webpack_require__(279);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_6__angular_common_http__ = __webpack_require__(78);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_7__providers_block_service__ = __webpack_require__(160);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_8__pages_home_home__ = __webpack_require__(159);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_9__pages_wallet_wallet__ = __webpack_require__(104);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_10__pages_transaction_transaction__ = __webpack_require__(102);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_11__pages_tabs_tabs__ = __webpack_require__(103);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_12__pages_tab4_tab4__ = __webpack_require__(101);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_13__providers_transaction_service__ = __webpack_require__(50);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};














var AppModule = /** @class */ (function () {
    function AppModule() {
    }
    AppModule = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_1__angular_core__["I" /* NgModule */])({
            declarations: [
                __WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* MyApp */],
                __WEBPACK_IMPORTED_MODULE_8__pages_home_home__["a" /* HomePage */],
                __WEBPACK_IMPORTED_MODULE_9__pages_wallet_wallet__["a" /* WalletPage */],
                __WEBPACK_IMPORTED_MODULE_10__pages_transaction_transaction__["a" /* TransactionPage */],
                __WEBPACK_IMPORTED_MODULE_12__pages_tab4_tab4__["a" /* Tab4Page */],
                __WEBPACK_IMPORTED_MODULE_11__pages_tabs_tabs__["a" /* TabsPage */]
            ],
            imports: [
                __WEBPACK_IMPORTED_MODULE_0__angular_platform_browser__["a" /* BrowserModule */],
                __WEBPACK_IMPORTED_MODULE_6__angular_common_http__["b" /* HttpClientModule */],
                __WEBPACK_IMPORTED_MODULE_2_ionic_angular__["c" /* IonicModule */].forRoot(__WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* MyApp */], {}, {
                    links: [
                        { loadChildren: '../pages/tab4/tab4.module#Tab4PageModule', name: 'Tab4Page', segment: 'tab4', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/transaction/transaction.module#TransactionPageModule', name: 'TransactionPage', segment: 'transaction', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/tabs/tabs.module#TabsPageModule', name: 'TabsPage', segment: 'tabs', priority: 'low', defaultHistory: [] },
                        { loadChildren: '../pages/wallet/wallet.module#WalletPageModule', name: 'WalletPage', segment: 'wallet', priority: 'low', defaultHistory: [] }
                    ]
                })
            ],
            bootstrap: [__WEBPACK_IMPORTED_MODULE_2_ionic_angular__["a" /* IonicApp */]],
            entryComponents: [
                __WEBPACK_IMPORTED_MODULE_5__app_component__["a" /* MyApp */],
                __WEBPACK_IMPORTED_MODULE_8__pages_home_home__["a" /* HomePage */],
                __WEBPACK_IMPORTED_MODULE_9__pages_wallet_wallet__["a" /* WalletPage */],
                __WEBPACK_IMPORTED_MODULE_10__pages_transaction_transaction__["a" /* TransactionPage */],
                __WEBPACK_IMPORTED_MODULE_12__pages_tab4_tab4__["a" /* Tab4Page */],
                __WEBPACK_IMPORTED_MODULE_11__pages_tabs_tabs__["a" /* TabsPage */]
            ],
            providers: [
                __WEBPACK_IMPORTED_MODULE_4__ionic_native_status_bar__["a" /* StatusBar */],
                __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__["a" /* SplashScreen */],
                __WEBPACK_IMPORTED_MODULE_7__providers_block_service__["a" /* BlockService */],
                __WEBPACK_IMPORTED_MODULE_13__providers_transaction_service__["a" /* TransactionService */],
                { provide: __WEBPACK_IMPORTED_MODULE_1__angular_core__["u" /* ErrorHandler */], useClass: __WEBPACK_IMPORTED_MODULE_2_ionic_angular__["b" /* IonicErrorHandler */] }
            ]
        })
    ], AppModule);
    return AppModule;
}());

//# sourceMappingURL=app.module.js.map

/***/ }),

/***/ 279:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return MyApp; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1_ionic_angular__ = __webpack_require__(28);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_2__ionic_native_status_bar__ = __webpack_require__(203);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__ = __webpack_require__(200);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_4__pages_tabs_tabs__ = __webpack_require__(103);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};





var MyApp = /** @class */ (function () {
    function MyApp(platform, statusBar, splashScreen) {
        this.rootPage = __WEBPACK_IMPORTED_MODULE_4__pages_tabs_tabs__["a" /* TabsPage */];
        platform.ready().then(function () {
            // Okay, so the platform is ready and our plugins are available.
            // Here you can do any higher level native things you might need.
            statusBar.styleDefault();
            splashScreen.hide();
        });
    }
    MyApp = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["m" /* Component */])({template:/*ion-inline-start:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/app/app.html"*/'<ion-nav [root]="rootPage"></ion-nav>\n'/*ion-inline-end:"/Users/ericf/ZCWProjects/ZipCoin-RED/ZipCoinRedIonicClient/src/app/app.html"*/
        }),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1_ionic_angular__["g" /* Platform */], __WEBPACK_IMPORTED_MODULE_2__ionic_native_status_bar__["a" /* StatusBar */], __WEBPACK_IMPORTED_MODULE_3__ionic_native_splash_screen__["a" /* SplashScreen */]])
    ], MyApp);
    return MyApp;
}());

//# sourceMappingURL=app.component.js.map

/***/ }),

/***/ 50:
/***/ (function(module, __webpack_exports__, __webpack_require__) {

"use strict";
/* harmony export (binding) */ __webpack_require__.d(__webpack_exports__, "a", function() { return TransactionService; });
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_0__angular_core__ = __webpack_require__(0);
/* harmony import */ var __WEBPACK_IMPORTED_MODULE_1__angular_common_http__ = __webpack_require__(78);
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};


var TransactionService = /** @class */ (function () {
    function TransactionService(http) {
        this.http = http;
        this.API = 'http://localhost:8080/api/v1';
        this.TRANSACTION_API = this.API + '/transactions';
    }
    TransactionService.prototype.createTransaction = function (transaction) {
        return this.http.post(this.TRANSACTION_API, transaction);
    };
    TransactionService.prototype.getAllTransactions = function () {
        return this.http.get(this.TRANSACTION_API);
    };
    TransactionService = __decorate([
        Object(__WEBPACK_IMPORTED_MODULE_0__angular_core__["A" /* Injectable */])(),
        __metadata("design:paramtypes", [__WEBPACK_IMPORTED_MODULE_1__angular_common_http__["a" /* HttpClient */]])
    ], TransactionService);
    return TransactionService;
}());

//# sourceMappingURL=transaction-service.js.map

/***/ })

},[204]);
//# sourceMappingURL=main.js.map