import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { HomePage } from '../home/home';
import { WalletPage } from '../wallet/wallet';
import { TransactionPage } from '../transaction/transaction';
import { Tab4Page } from '../tab4/tab4';
@IonicPage()
@Component({
  selector: 'page-tabs',
  templateUrl: 'tabs.html',
})
export class TabsPage {
  homePage = HomePage;
  walletPage = WalletPage;
  transactionPage = TransactionPage;
  tab4 = Tab4Page; 
  constructor() {

  }
}
