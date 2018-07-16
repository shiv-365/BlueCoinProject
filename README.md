# ZipCoin

a zip code crypto-currency system

### Project planning:
Use the git server to record project plans in the project repo’s wiki.
Each project must keep:
* An overview document of the project
* A plan of phases of the project
* The issue tracker in the repo must track what’s being worked on
  * Track the assignment of different parts of the project to students (using Issues)
  * Each section of the app needs to keep pages on its design, progress and bugs (using Issues)
  * All issues should be attached to project milestones and assigned to team members.
* UML diagrams and specs must be kept, seriously. 
* API design docs, for each segment where a protocol needs to be used for data communications.
* Designs should use Model/View/Controller, with Client and Server focus subgroups
* UI/UX should be done in Typescript/Ionic/Angular (or another pre-approved)
* The database should be either MySQL, MariaDB or Postgres.
*The app server must be based on Spring.io (probably spring boot)

Each web-app project needs to include a server backed by a database and one or more clients (web? Mobile? terminal?).
The project work should be in agile sprints of 3-5 days, commit histories are important. Each students should work in a different git branch). Multiple commits should be done daily on all personal work. All sprints end with a complete merge back to the master branch, and a demo/preso for an instructor.
The project should start with simple features, and then add to it over the course of several weeks (and several sprints).
The internet has many different ways of doing each of these projects, tutorials, descriptions and so on, describing how these things can be done. Research on the topics should be considered to be the very first task a group should do on the project.
The User Interface for the project should start with simple UIs, and refine/embellish them over the sprints. The final front end UI should be written in Typescript/Ionic/Angular (or in a UX framework approved by Kris).

### Description

Project is to create a way to pay each other “zips” a crypto currency that is worth exactly nothing. Each zipcoin is divided into 10000 ‘tariqs’. A user wallet is built that provides a way for UserA to pay UserB some amount of Zips (or some number of tariqs). Each transaction should contain a “purpose” field (or “description”). Some each transaction is a tuple (date, payer, payee, amount (zips/tariqs) and a purpose).

A server capable of integrating into a community must be built, so that a series of servers can be put up and a blockchain maintained among them. The chain should be kept in a db, and there should be a way to verify that a chain you’re receiving from a neighbor is in fact a correct chain when a machine joins a network. As transactions are added to a com.zipcoin.block (& the chain), a group consensys should be determined for each com.zipcoin.block. Which consensys algorithm is used must pre-approved by an instructor.

The consensus algorithm can be a mining algorithm for proof of work. Or perhaps, a permissioned chain is a better idea, it is much more likely to be what a student may see the first time they find a blockchain in the wild.
SO a permissioned chain(?) that uses github_id as the way an address of a wallet gets created.
Zipcoins are granted based on instructor review of features in the apps

A client ‘wallet’ needs to be created to trade zipcoins. Simple Client UI for starters, refine over sprints.

The start is a simple server REST API that can handle test transactions being added to the chain. Then add the ability to “mine” com.zipcoin.block based on the transactions being sent around. 

There are two APIs that need to be built, one for client to chain interaction (for the posting of transactions and the receiving of zips then paid) and two, for the server to server chain protocol.

Like venmo, it’s meant to be a way people can pay each other for different things. Simple pay for a reason and to another person.
