export class Transaction{
    constructor(
        public transactionId : string,
        public sender : string,
        public recipient : string,
        public value : number,
    ){}
 }