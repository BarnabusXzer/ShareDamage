# ShareDamage

***
 
 ShareDamage is a Minecraft plugin that causes everyone on the server to take damage when one player takes damage. This plugin was developed for 1.18.2 Spigot and Bukkit servers.


## Commands 

***
    
There are two commands:

* sharedamage
* showcause


## Command Description

***

### sharedamage
When the sharedamage command is used players will begin taking modified damage according to the command arguments. This command accepts up to three arguements that are explained further in the usage section

### showcause
When the showcause command is used the cause for the original damage is outputed to the player chat. This was originally used for debugging but became a fun feature after recieving positive feedback about it. 


## Usage

***

### sharedamage

**Usage:** `/shareddamage <status> <mode> <difficulty>`    
**Expanded Usage:** `/shareddamage (On|Off) [Equal|Shared|Inverse] [Easy|Medium|Intermediate|Hard|Impossible]`    

<br>

<table style="border: 1px solid white; border-collapse: collapse; width:100%">
    <tr>
        <th style="border: 1px solid white; text-align:center; width:25%">Argument</th>
        <th style="border: 1px solid white; text-align:center; width:25%">Valid Inputs</th>
        <th style="border: 1px solid white; text-align:center; width:25%">Required</th>
        <th style="border: 1px solid white; text-align:center; width:25%">Default Input</th>
    </tr>
    <tr>
        <td style="border: 1px solid white; text-align:center">status</td>
        <td style="border: 1px solid white; text-align:center">on, off</td>
        <td style="border: 1px solid white; text-align:center">yes</td>
        <td style="border: 1px solid white; text-align:center">N/A</td>
    </tr>
    <tr>
        <td style="border: 1px solid white; text-align:center">mode</td>
        <td style="border: 1px solid white; text-align:center">equal, shared, inverse</td>
        <td style="border: 1px solid white; text-align:center">no</td>
        <td style="border: 1px solid white; text-align:center">equal</td>
    </tr>
    <tr>
        <td style="border: 1px solid white; text-align:center">difficulty</td>
        <td style="border: 1px solid white; text-align:center">easy, medium, intermediate, normal, hard, impossible</td>
        <td style="border: 1px solid white; text-align:center">no</td>
        <td style="border: 1px solid white; text-align:center">normal</td>
    </tr>
</table>

<br>

##### Status:
Determines whether players recieve modified damage    
**Valid Arguments:**    
On: Enables modified damage    
Off: Disables modified damage 
##### Mode:
Defines how damage is distributed among players    
**Valid Arguments:**       
Equal: Damages all players equal to the modified damage    
Shared: Damages all players equal to the modified damage divided by the ammount of players    
Inverse: Damages all players equal to the modified damage, except for the player who triggered the damage event    
##### Difficulty:
Mulitplies original damage value to create the modified damage    
**Valid Arguments:**   
Easy: Damage is multiplied by 25%    
Medium: Damage is multiplied by 50%    
Intermediate: Damage is multiplied by 75%    
Normal: Damage is multiplied by 100%    
Hard: Damage is multiplied by 150%    
Impossible: Damage is multiplied by 200%    


### showcause

**Usage:** `/showcause <status>`    
**Expanded Usage:** `/showcause (On|Off)`

<br>

<table style="border: 1px solid white; border-collapse: collapse; width:100%">
    <tr>
        <th style="border: 1px solid white; text-align:center; width:25%">Argument</th>
        <th style="border: 1px solid white; text-align:center; width:25%">Valid Inputs</th>
        <th style="border: 1px solid white; text-align:center; width:25%">Required</th>
        <th style="border: 1px solid white; text-align:center; width:25%">Default Input</th>
    </tr>
    <tr>
        <td style="border: 1px solid white; text-align:center">status</td>
        <td style="border: 1px solid white; text-align:center">on, off</td>
        <td style="border: 1px solid white; text-align:center">yes</td>
        <td style="border: 1px solid white; text-align:center">N/A</td>
    </tr>
</table>

<br>

##### Status:
Determines whether players recieve damage cause message    
**Valid Arguments:**    
On: Enables damage cause message    
Off: Disables damage cause message     


## Permissions

***

### sharedamage

**Permission:** sd.sharedamage    
**Default:** op    

### showcause

**Permission:** sd.showcause    
**Default:** op    

<br>

*Author: WHansenVD*