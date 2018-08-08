export class Transaction{
    constructor(
        public transactionId : number,
        public senderPublicKey : string,
        public recipientPublicKey : string,
        public amount : number,
    ){}
 }