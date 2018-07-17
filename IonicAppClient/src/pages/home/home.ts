import { Component } from '@angular/core';
import { NavController } from 'ionic-angular';
import { BlockService } from '../../providers/block-service'
@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
private block:any;
  constructor(public navCtrl: NavController, public blockService: BlockService) {
  }

}
