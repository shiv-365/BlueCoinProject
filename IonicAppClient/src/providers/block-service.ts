import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Injectable} from "@angular/core";

@Injectable()
export class BlockService{
 public API = "http://localhost:8080/api/v1";
 public BLOCK_API = this.API + "/blocks";
 
 constructor(public http: HttpClient) {
 }

 get(id: string) {
   return this.http.get(this.BLOCK_API + '/' + id);
 }
}