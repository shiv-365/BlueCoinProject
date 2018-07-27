import { Injectable } from "@angular/core";
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs/Observable";
import { Transaction } from "../model/transaction";

@Injectable()
export class TransactionService{
 public API = 'http://localhost:8080/api/v1';
 public BLOCK_API = this.API + '/transactions';
 
 constructor(public http: HttpClient) {
 }

 createTransaction(transaction: Transaction) : Observable<Transaction> {
     return this.http.post<Transaction>(this.BLOCK_API, transaction);
 }

}