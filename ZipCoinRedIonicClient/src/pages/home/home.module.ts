import { NgModule } from "@angular/core";
import { IonicPageModule } from "ionic-angular/umd";
import { HomePage } from "./home";
import { BlockService } from "../../providers/block-service";

@NgModule({
    declarations: [
        HomePage,
    ],
    imports: [
        IonicPageModule.forChild(HomePage),
    ],
    providers: [
        BlockService,
    ]
})
export class HomePageModule {}