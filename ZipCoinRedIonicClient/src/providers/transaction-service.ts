import { Injectable } from "@angular/core";
import { HttpClient, HttpErrorResponse } from "@angular/common/http";
import { Observable } from "rxjs";
import { Transaction } from "../model/transaction";

@Injectable()
export class TransactionService{
 public API = 'http://localhost:8080/api/v1';
 public TRANSACTION_API = this.API + '/transactions';
 
 constructor(public http: HttpClient) {
 }

 createTransaction(transaction: Transaction) : Observable<Transaction> {
     return this.http
     .post<Transaction>(this.TRANSACTION_API, transaction)
     .catch((err: HttpErrorResponse) => {
       console.error('Not good...', err.error)
       return Observable.throw(err.statusText);
     })
 }

 getAllTransactions() : Observable<any> {
    return this.http.get(this.TRANSACTION_API)
  }

  getAllWallets() : Observable<any> {
    return this.http.get("http://localhost:8080/api/v1/wallets")
  }

}