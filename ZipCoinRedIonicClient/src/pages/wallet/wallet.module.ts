import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { WalletPage } from './wallet';
import { TransactionService } from '../../providers/transaction-service';

@NgModule({
  declarations: [
    WalletPage,
  ],
  imports: [
    TransactionService,
    IonicPageModule.forChild(WalletPage),
  ]
})
export class WalletPageModule {}
