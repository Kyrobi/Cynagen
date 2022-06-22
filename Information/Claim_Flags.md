
**NOTE: This feature is no longer available on the server**


Claim flags allows you to customize some rules inside
your claim. An example or this would be enabling PvP
inside your claim or to block a certain player from
entering your claim.


Command to set flag: /setclaimflag SetClaimFlag <flag>

Command to unset flag: /setclaimflag UnsetClaimFlag <flag>


## Available flags:

### AllowPvP
- To **allow** pvp: ```/setclaimflag SetClaimFlag AllowPvP```
- To **turn off** pvp: ```/setclaimflag UnSetClaimFlag AllowPvP```

PvP doesn't work? Make sure to not be in the same party!


### NoEnter
- To **deny** all players from entering: ```/setclaimflag setClaimFlag NoEnter```
- To **allow** players to enter: ```/setclaimflag setClaimFlag NoEnter```


### NoEnterPlayer
- To **deny** a player from entering: ```/setclaimflag setClaimFlag NoEnterPlayer Kyrobi```
- To **deny** multiple players from entering: ```/setclaimflag setClaimFlag NoEnterPlayer Kyrobi, Kyrobert, JokerBoss, Caliteo```
- To **allow** player from entering: ```/setclaimflag unsetClaimFlag NoEnterPlayer```

(Unfortunately, I do not think you can allow a specific player back into the claim without upsetting the flag completely)
(Also unfortunately, I do not think you can deny new players by just typing /gpflags setClaimFlag NoEnterPlayer Kyrobi again. You will have to type that along with everyone again like /gpflags setClaimFlag NoEnterPlayer Kyrobi, Kyrobert, JokerBoss, Caliteo)


## Extra flags for VIP rank:

### ExitMessage
- To **set** a message when player leave claim: ```/setclaimflag setClaimFlag ExitMessage (message)```
- To **remove** the message: ```/setclaimflag unsetClaimFlag ExitMessage```


### EnterMessage
- To **set** a message when player leave claim: ```/setclaimflag setClaimFlag EnterMessage (message)```
- To **remove** the message: ```/setclaimflag unsetClaimFlag EnterMessage```
