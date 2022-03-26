Claim flags allows you to customize some rules inside
your claim. An example or this would be enabling PvP
inside your claim or to block a certain player from
entering your claim.


Command to set flag: /gpflags SetClaimFlag <flag>

Command to unset flag: /gpflags UnsetClaimFlag <flag>


Available flags:

- AllowPvP
To **allow** pvp: /gpflags SetClaimFlag AllowPvP
To **turn off** pvp: /gpflags UnSetClaimFlag AllowPvP

PvP doesn't work? Make sure to not be in the same party!


- NoEnter
To **deny** all players from entering: /gpflags setClaimFlag NoEnter
To **allow** players to enter: /gpflags setClaimFlag NoEnter


- NoEnterPlayer
To **deny** a player from entering: /gpflags setClaimFlag NoEnterPlayer Kyrobi
To **deny** multiple players from entering: /gpflags setClaimFlag NoEnterPlayer Kyrobi, Kyrobert, JokerBoss, Caliteo
To **allow** player from entering: /gpflags unsetClaimFlag NoEnterPlayer

(Unfortunately, I do not think you can allow a specific player back into the claim without upsetting the flag completely)
(Also unfortunately, I do not think you can deny new players by just typing /gpflags setClaimFlag NoEnterPlayer Kyrobi again. You will have to type that along with everyone again like /gpflags setClaimFlag NoEnterPlayer Kyrobi, Kyrobert, JokerBoss, Caliteo)


Extra flags for VIP rank:

- ExitMessage
To **set** a message when player leave claim: /gpflags setClaimFlag ExitMessage (message)
To **remove** the message: /gpflags unsetClaimFlag ExitMessage


- EnterMessage
To **set** a message when player leave claim: /gpflags setClaimFlag EnterMessage (message)
To **remove** the message: /gpflags unsetClaimFlag EnterMessage
