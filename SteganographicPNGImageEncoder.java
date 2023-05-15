import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

/*
Liam Pitchford
Last Edit: 15/5/23

An Encoder that takes in a PNG image and a String message.
The String Message will be encoded within the Image.
The Program will output the original image, the encoded image, and the message read from the encoded image.
The Original Image is output to compare with the encoded image. The Message is output for debugging purposes.

 */


public class SteganographicPNGImageEncoder {

    public static int w = 256;
    public static int h = 256;
    public static Random rand = new Random();
    public static String pathName = "";
    public static String message = "According to all known laws of aviation there is no way that a bee should be able to fly Its wings are too small to get its fat little body off the ground The bee of course flies anyway Because bees dont care what humans think is impossible SEQ INTRO TO BARRY INT BENSON HOUSE DAY ANGLE ON Sneakers on the ground Camera PANS UP to reveal BARRY BENSONS BEDROOM ANGLE ON Barrys hand flipping through different sweaters in his closet BARRY Yellow black yellow black yellow black yellow black yellow black yellow blackoohh black and yellow ANGLE ON Barry wearing the sweater he picked looking in the mirror BARRY CONTD Yeah lets shake it up a little He picks the black and yellow one He then goes to the sink takes the top off a CONTAINER OF HONEY and puts some honey into his hair He squirts some in his mouth and gargles Then he takes the lid off the bottle and rolls some on like deodorant CUT TO INT BENSON HOUSE KITCHEN CONTINUOUS Barrys mother JANET BENSON yells up at Barry JANET BENSON Barry breakfast is ready CUT TO Bee Movie JS REVISIONS INT BARRYS ROOM CONTINUOUS BARRY Coming SFX Phone RINGING Barrys antennae vibrate as they RING like a phone Barrys hands are wet He looks around for a towel BARRY CONTD Hang on a second He wipes his hands on his sweater and pulls his antennae down to his ear and mouth BARRY CONTD Hello His best friend ADAM FLAYMAN is on the other end ADAM Barry BARRY Adam ADAM Can you believe this is happening BARRY Cant believe it Ill pick you up Barry sticks his stinger in a sharpener SFX BUZZING AS HIS STINGER IS SHARPENED He tests the sharpness with his finger SFX Bing BARRY CONTD Looking sharp ANGLE ON Barry hovering down the hall sliding down the staircase bannister Barrys mother JANET BENSON is in the kitchen JANET BENSON Barry why dont you use the stairs Your father paid good money for those Bee Movie JS REVISIONS BARRY Sorry Im excited Barrys father MARTIN BENSON ENTERS Hes reading a NEWSPAPER with the HEADLINE Queen gives birth to thousandtuplets Resting Comfortably MARTIN BENSON Heres the graduate Were very proud of you Son And a perfect report card all Bs JANET BENSON mushing Barrys hair Very proud BARRY Ma Ive got a thing going here Barry readjusts his hair starts to leave JANET BENSON Youve got some lint on your fuzz She picks it off BARRY Ow thats me MARTIN BENSON Wave to us Well be in row Barry zips off BARRY Bye JANET BENSON Barry I told you stop flying in the house CUT TO SEQ DRIVING TO GRADUATION EXT BEE SUBURB MORNING A GARAGE DOOR OPENS Barry drives out in his CAR Bee Movie JS REVISIONS ANGLE ON Barrys friend ADAM FLAYMAN standing by the curb Hes reading a NEWSPAPER with the HEADLINE Frisbee Hits Hive Internet Down Beestander I heard a sound and next thing I knewwhamo Barry drives up stops in front of Adam Adam jumps in BARRY Hey Adam ADAM Hey Barry pointing at Barrys hair Is that fuzz gel BARRY A little Its a special day Finally graduating ADAM I never thought Id make it BARRY Yeah three days of grade school three days of high school ADAM Those were so awkward BARRY Three days of college Im glad I took off one day in the middle and just hitchhiked around the hive ADAM You did come back different They drive by a bee whos jogging ARTIE Hi Barry BARRY to a bee pedestrian Hey Artie growing a mustache Looks good Barry and Adam drive from the suburbs into the city ADAM Hey did you hear about Frankie Bee Movie JS REVISIONS BARRY Yeah ADAM You going to his funeral BARRY No Im not going to his funeral Everybody knows you sting someone you die you dont waste it on a squirrel He was such a hot head ADAM Yeah I guess he couldve just gotten out of the way The DRIVE through a loop de loop BARRY AND ADAM WhoaWhooowheee ADAM I love this incorporating the amusement park right into our regular day BARRY I guess thats why they say we dont need vacations CUT TO SEQ GRADUATION EXT GRADUATION CEREMONY CONTINUOUS Barry and Adam come to a stop They exit the car and fly over the crowd to their seats BARRY re graduation ceremony Boy quite a bit of pompunder the circumstances They land in their seats BARRY CONTD Well Adam today we are men Bee Movie JS REVISIONS ADAM We are BARRY Beemen ADAM Amen BARRY Hallelujah Barry hits Adams forehead Adam goes into the rapture An announcement comes over the PA ANNOUNCER VO Students faculty distinguished beesplease welcome Dean Buzzwell ANGLE ON DEAN BUZZWELL steps up to the podium The podium has a sign that reads Welcome Graduating Class of with trainstation style flipping numbers after it BUZZWELL Welcome New Hive City graduating class of The numbers on the podium change to BUZZWELL CONTD he clears his throat And that concludes our graduation ceremonies And begins your career at Honex Industries BARRY Are we going to pick our job today ADAM I heard its just orientation The rows of chairs change in transformerlike mechanical motion to Universal Studios type tour trams Buzzwell walks off stage BARRY re trams Whoa heads up Here we go Bee Movie JS REVISIONS SEQ FACTORY FEMALE VOICE VO Keep your hands and antennas inside the tram at all times in Spanish Dejen las manos y antennas adentro del tram a todos tiempos BARRY I wonder what its going to be like ADAM A little scary Barry shakes Adam BARRY AND ADAM AAHHHH The tram passes under SIGNS READING Honex A Division of Honesco A Part of the Hexagon Group TRUDY Welcome to Honex a division of Honesco and a part of the Hexagon group BARRY This is it The Honex doors OPEN revealing the factory BARRY CONTD Wow TRUDY We know that you as a bee have worked your whole life to get to the point where you can work for your whole life Honey begins when our valiant pollen jocks bring the nectar to the hive where our top secret formula is automatically colorcorrected scent adjusted and bubble contoured into this Trudy GRABS a TEST TUBE OF HONEY from a technician Bee Movie JS REVISIONS TRUDY CONTD soothing sweet syrup with its distinctive golden glow you all know as EVERYONE ON THE TRAM in unison Honey Trudy flips the flask into the crowd and laughs as they all scramble for it ANGLE ON A GIRL BEE catching the honey ADAM sotto That girl was hot BARRY sotto Shes my cousin ADAM She is BARRY Yes were all cousins ADAM Right Youre right TRUDY At Honex we also constantly strive to improve every aspect of bee existence These bees are stress testing a new helmet technology ANGLE ON A STUNT BEE in a HELMET getting hit with a NEWSPAPER then a SHOE then a FLYSWATTER He gets up and gives a thumbs up The graduate bees APPLAUD ADAM re stunt bee What do you think he makes BARRY Not enough TRUDY And here we have our latest advancement the Krelman Bee Movie JS REVISIONS BARRY Wow what does that do TRUDY Catches that little strand of honey that hangs after you pour it Saves us millions ANGLE ON The Krelman machine Bees with handshaped hats on rotating around a wheel to catch drips of honey Adams hand shoots up ADAM Can anyone work on the Krelman TRUDY Of course Most bee jobs are small ones But bees know that every small job if its done well means a lot There are over different bee occupations But choose carefully because youll stay in the job that you pick for the rest of your life The bees CHEER ANGLE ON Barrys smile dropping slightly BARRY The same job for the rest of your life I didnt know that ADAM Whats the difference TRUDY And youll be happy to know that bees as a species havent had one day off in million years BARRY So youll just work us to death TRUDY laughing Well sure try Everyone LAUGHS except Barry Bee Movie JS REVISIONS The tram drops down a logflume type steep drop Cameras flash as all the bees throw up their hands The frame freezes into a snapshot Barry looks concerned The tram continues through doors FORM DISSOLVE TO SEQ WALKING THE HIVE INT HONEX LOBBY ANGLE ON The logflume photo as Barry looks at it ADAM Wow That blew my mind BARRY annoyed Whats the difference Adam how could you say that One job forever Thats an insane choice to have to make ADAM Well Im relieved Now we only have to make one decision in life BARRY But Adam how could they never have told us that ADAM Barry why would you question anything Were bees Were the most perfectly functioning society on Earth They walk by a newspaper stand with A SANDWICH BOARD READING Bee Goes Berserk Stings Seven Then Self ANGLE ON A BEE filling his cars gas tank from a honey pump He fills his car some then takes a swig for himself NEWSPAPER BEE to the bee guzzling gas Hey Barry and Adam begin to cross the street Bee Movie JS REVISIONS BARRY Yeah but Adam did you ever think that maybe things work a little too well around here They stop in the middle of the street The traffic moves perfectly around them ADAM Like what Give me one example BARRY thinks I dont know But you know what Im talking about They walk off SEQ MEET THE JOCKS SFX The SOUND of Pollen Jocks PAN DOWN from the Honex statue JGATE ANNOUNCER Please clear the gate Royal Nectar Force on approach Royal Nectar Force on approach BARRY Wait a second Check it out Hey hey those are Pollen jocks ADAM Wow FOUR PATROL BEES FLY in through the hives giant Gothic entrance The Patrol Bees are wearing fighter pilot helmets with black visors ADAM CONTD Ive never seen them this close BARRY They know what its like to go outside the hive ADAM Yeah but some of them dont come back Bee Movie JS REVISIONS The nectar from the pollen jocks is removed from their backpacks and loaded into trucks on their way to Honex A SMALL CROWD forms around the Patrol Bees Each one has a PIT CREW that takes their nectar Lou Loduca hurries a pit crew along LOU LODUCA You guys did great Youre monsters Youre sky freaks I love it I love it SCHOOL GIRLS are jumping up and down and squealing nearby BARRY I wonder where those guys have just been ADAM I dont know BARRY Their days not planned Outside the hive flying whoknowswhere doing whoknowswhat ADAM You cant just decide one day to be a Pollen Jock You have to be bred for that BARRY Right Pollen Jocks cross in close proximity to Barry and Adam Some pollen falls off onto Barry and Adam BARRY CONTD Look at that Thats more pollen than you and I will ever see in a lifetime ADAM playing with the pollen Its just a status symbol I think bees make too big a deal out of it BARRY Perhaps unless youre wearing it and the ladies see you wearing it ANGLE ON Two girl bees Bee Movie JS REVISIONS ADAM Those ladies Arent they our cousins too BARRY Distant distant ANGLE ON TWO POLLEN JOCKS JACKSON Look at these two SPLITZ Couple of Hive Harrys JACKSON Lets have some fun with them The pollen jocks approach Barry and Adam continue to talk to the girls GIRL It must be so dangerous being a pollen jock BARRY Oh yeah one time a bear had me pinned up against a mushroom He had one paw on my throat and with the other he was slapping me back and forth across the face GIRL Oh my BARRY I never thought Id knock him out GIRL to Adam And what were you doing during all of this ADAM Obviously I was trying to alert the authorities The girl swipes some pollen off of Adam with a finger BARRY re pollen I can autograph that if you want Bee Movie JS REVISIONS JACKSON Little gusty out there today wasnt it comrades BARRY Yeah Gusty BUZZ You know were going to hit a sunflower patch about six miles from here tomorrow BARRY Six miles huh ADAM whispering Barry BUZZ Its a puddlejump for us But maybe youre not up for it BARRY Maybe I am ADAM whispering louder You are not BUZZ Were going ohnine hundred at JGate ADAM re jgate Whoa BUZZ leaning in on top of Barry What do you think Buzzy Boy Are you bee enough BARRY I might be It all depends on what ohnine hundred means CUT TO SEQ THE BALCONY Bee Movie JS REVISIONS INT BENSON HOUSE BALCONY LATER Barry is standing on the balcony alone looking out over the city Martin Benson ENTERS sneaks up behind Barry and gooses him in his ribs MARTIN BENSON Honex BARRY Oh Dad You surprised me MARTIN BENSON laughing Have you decided what youre interested in Son BARRY Well theres a lot of choices MARTIN BENSON But you only get one Martin LAUGHS BARRY Dad do you ever get bored doing the same job every day MARTIN BENSON Son let me tell you something about stirring making the stirring motion You grab that stick and you just move it around and you stir it around You get yourself into a rhythm its a beautiful thing BARRY You know dad the more I think about it maybe the honey field just isnt right for me MARTIN BENSON And you were thinking of what making balloon animals Thats a bad job for a guy with a stinger Bee Movie JS REVISIONS BARRY Well no MARTIN BENSON Janet your sons not sure he wants to go into honey JANET BENSON Oh Barry you are so funny sometimes BARRY Im not trying to be funny MARTIN BENSON Youre not funny youre going into honey Our son the stirrer JANET BENSON Youre going to be a stirrer BARRY No ones listening to me MARTIN BENSON Wait until you see the sticks I have for you BARRY I can say anything I want right now Im going to get an ant tattoo JANET BENSON Lets open some fresh honey and celebrate BARRY Maybe Ill pierce my thorax MARTIN BENSON toasting To honey BARRY Shave my antennae JANET BENSON To honey Bee Movie JS REVISIONS BARRY Shack up with a grasshopper get a gold tooth and start calling everybody Dawg CUT TO SEQ JOB PLACEMENT EXT HONEX LOBBY CONTINUOUS ANGLE ON A BEE BUS STOP One group of bees stands on the pavement as another group hovers above them A doubledecker bus pulls up The hovering bees get on the top level and the standing bees get on the bottom Barry and Adam pull up outside of Honex ADAM I cant believe were starting work today BARRY Todays the day Adam jumps out of the car ADAM OC Come on All the good jobs will be gone BARRY Yeah right ANGLE ON A BOARD READING JOB PLACEMENT BOARD Buzzwell the Bee Processor is at the counter Another BEE APPLICANT SANDY SHRIMPKIN is EXITING SANDY SHRIMPKIN Is it still available BUZZWELL Hang on he looks at changing numbers on the board Two left Andone of thems yours Congratulations Son step to the side please Bee Movie JS REVISIONS SANDY SHRIMPKIN Yeah ADAM to Sandy leaving What did you get SANDY SHRIMPKIN Picking the crud out That is stellar ADAM Wow BUZZWELL to Adam and Barry Couple of newbies ADAM Yes Sir Our first day We are ready BUZZWELL Well step up and make your choice ANGLE ON A CHART listing the different sectors of Honex Heating Cooling Viscosity Krelman Pollen Counting Stunt Bee Pouring Stirrer Humming Regurgitating Front Desk Hair Removal Inspector No Chef Lint Coordinator Stripe Supervisor Antennaeball polisher Mite Wrangler Swatting Counselor Wax Monkey Wing Brusher Hive Keeper Restroom Attendant ADAM to Barry You want to go first BARRY No you go ADAM Oh my Whats available BUZZWELL Restroom attendant is always open and not for the reason you think ADAM Any chance of getting on to the Krelman Sir BUZZWELL Sure youre on Bee Movie JS REVISIONS He plops the KRELMAN HAT onto Adams head ANGLE ON The job board THE COLUMNS READ OCCUPATION POSITIONS AVAILABLE and STATUS The middle column has numbers and the right column has job openings flipping between open pending and closed BUZZWELL CONTD Oh Im sorry The Krelman just closed out ADAM Oh He takes the hat off Adam BUZZWELL Wax Monkeys always open The Krelman goes from Closed to Open BUZZWELL CONTD And the Krelman just opened up again ADAM What happened BUZZWELL Well whenever a bee dies thats an opening pointing at the board See that Hes dead dead another dead one deady deadified two more dead Dead from the neck up dead from the neck down But thats life ANGLE ON Barrys disturbed expression ADAM feeling pressure to decide Oh this is so hard Heating cooling stunt bee pourer stirrer humming inspector no lint coordinator stripe supervisor antennaball polisher mite wrangler Barry Barry what do you think I should Barry Barry Bee Movie JS REVISIONS Barry is gone CUT TO SEQ LOU LODUCA SPEECH EXT JGATE SAME TIME Splitz Jackson Buzz Lou and two other BEES are going through final preflight checks Barry ENTERS LOU LODUCA Alright weve got the sunflower patch in quadrant nine Geranium window box on Sutton Place Barrys antennae rings like a phone ADAM VO What happened to you Where are you Barry whispers throughout BARRY Im going out ADAM VO Out Out where BARRY Out there ADAM VO putting it together Oh no BARRY I have to before I go to work for the rest of my life ADAM VO Youre going to die Youre crazy Hello BARRY Oh another call coming in Bee Movie JS REVISIONS ADAM VO Youre cra Barry HANGS UP ANGLE ON Lou Loduca LOU LODUCA If anyones feeling brave theres a Korean Deli on rd that gets their roses today BARRY timidly Hey guys BUZZ Well look at that SPLITZ Isnt that the kid we saw yesterday LOU LODUCA to Barry Hold it son flight decks restricted JACKSON Its okay Lou were going to take him up Splitz and Jackson CHUCKLE LOU LODUCA Really Feeling lucky are ya A YOUNGER SMALLER BEE THAN BARRY CHET runs up with a release waiver for Barry to sign CHET Sign here Here Just initial that Thank you LOU LODUCA Okay you got a rain advisory today and as you all know bees cannot fly in rain So be careful As always reading off clipboard watch your brooms hockey sticks dogs birds bears and bats Bee Movie JS REVISIONS Also I got a couple reports of root beer being poured on us Murphys in a home because of it just babbling like a cicada BARRY Thats awful LOU LODUCA And a reminder for all you rookies bee law number one absolutely no talking to humans Alright launch positions The Jocks get into formation chanting as they move LOU LODUCA CONTD Black and Yellow JOCKS Hello SPLITZ to Barry Are you ready for this hot shot BARRY Yeah Yeah bring it on Barry NODS terrified BUZZ Wind CHECK JOCK Antennae CHECK JOCK Nectar pack CHECK JACKSON Wings CHECK SPLITZ Stinger CHECK BARRY Scared out of my shorts CHECK LOU LODUCA Okay ladies lets move it out Everyone FLIPS their goggles down Pit crew bees CRANK their wings and remove the starting blocks We hear loud HUMMING Bee Movie JS REVISIONS LOU LODUCA CONTD LOU LODUCA CONTD Pound those petunias you striped stemsuckers All of you drain those flowers A FLIGHT DECK GUY in deep crouch handsignals them out the archway as the backwash from the bee wings FLUTTERS his jump suit Barry follows everyone SEQ FLYING WITH THE JOCKS The bees climb above tree tops in formation Barry is euphoric BARRY Whoa Im out I cant believe Im out So blue Ha ha ha a beat I feel so fastand free re kites in the sky Box kite Wow They fly by several bicyclists and approach a patch of flowers BARRY CONTD Flowers SPLITZ This is blue leader We have roses visual Bring it around thirty degrees and hold BARRY sotto Roses JACKSON Thirty degrees roger bringing it around Many pollen jocks break off from the SteganographicPNGImageEncoder group They use their equipment to collect nectar from flowers Barry flies down to watch the jocks collect the nectar JOCK Stand to the side kid its got a bit of a kick The jock fires the gun and recoils Barry watches the gun fill up with nectar Bee Movie JS REVISIONS BARRY Oh that is one Nectar Collector JOCK You ever see pollination up close BARRY No Sir He takes off and the excess pollen dust falls causing the flowers to come back to life JOCK as he pollinates I pick some pollen up over here sprinkle it over here maybe a dash over there pinch on that onesee that Its a little bit of magic aint it The FLOWERS PERK UP as he pollinates BARRY Wow Thats amazing Why do we do that JOCK thats pollen power Kid More pollen more flowers more nectar more honey for us BARRY Cool The Jock WINKS at Barry Barry rejoins the other jocks in the sky They swoop in over a pond kissing the surface We see their image reflected in the water theyre really moving They fly over a fountain BUZZ Im picking up a lot of bright yellow could be daisies Dont we need those SPLITZ Copy that visual We see what appear to be yellow flowers on a green field Bee Movie JS REVISIONS They go into a deep bank and dive BUZZ Hold on one of these flowers seems to be on the move SPLITZ Say againAre you reporting a moving flower BUZZ Affirmative SEQ TENNIS GAME The pollen jocks land It is a tennis court with dozens of tennis balls A COUPLE VANESSA and KEN plays tennis The bees land right in the midst of a group of balls KEN OC That was on the line The other bees start walking around amongst the immense yellow globes SPLITZ This is the coolest What is it They stop at a BALL on a white line and look up at it JACKSON I dont know but Im loving this color SPLITZ smelling tennis ball Smells good Not like a flower But I like it JACKSON Yeah fuzzy BUZZ Chemicaly JACKSON Careful guys its a little grabby Barry LANDS on a ball and COLLAPSES Bee Movie JS REVISIONS BARRY Oh my sweet lord of bees JACKSON Hey candy brain get off there Barry attempts to pulls his legs off but they stick BARRY Problem A tennis shoe and a hand ENTER FRAME The hand picks up the ball with Barry underneath it BARRY CONTD Guys BUZZ This could be bad JACKSON Affirmative Vanessa walks back to the service line BOUNCES the ball Each time it BOUNCES the other bees cringe and GASP ANGLE ON Barry terrified Pure dumb luck hes not getting squished BARRY with each bounce Very closeGonna HurtMammas little boy SPLITZ You are way out of position rookie ANGLE ON Vanessa serving We see Barry and the ball up against the racket as she brings it back She tosses the ball into the air Barrys eyes widen The ball is STRUCK and the rally is on KEN Coming in at you like a missile Ken HITS the ball back Barry feels the gforces ANGLE ON The Pollen Jocks watching Barry pass by them in SLOW MOTION Bee Movie JS REVISIONS BARRY in slow motion Help me JACKSON You know I dont think these are flowers SPLITZ Should we tell him JACKSON I think he knows BARRY OS What is this Vanessa HITS a high arcing lob Ken waits poised for the return We see Barry having trouble maneuvering the ball from fatigue KEN overly confident Match point ANGLE ON Ken running up He has a killer look in his eyes Hes going to hit the ultimate overhead smash KEN CONTD You can just start packing up Honey because I believe youre about to eat it ANGLE ON Pollen Jocks JACKSON Ahem Ken is distracted by the jock KEN What No He misses badly The ball rockets into oblivion Barry is still hanging on ANGLE ON Ken berating himself KEN CONTD Oh you cannot be serious We hear the ball WHISTLING and Barry SCREAMING Bee Movie JS REVISIONS BARRY Yowser SEQ SUV The ball flies through the air and lands in the middle of the street It bounces into the street again and sticks in the grille of an SUV INT CAR ENGINE CONTINUOUS BARRYS POV the grille of the SUV sucks him up He tumbles through a black tunnel whirling vanes and pistons BARRY AHHHHHHHHHHH OHHHH EECHHH AHHHHHH Barry gets chilled by the AC system and sees a frozen grasshopper BARRY CONTD re grasshopper Eww gross CUT TO INT CAR CONTINUOUS The car is packed with a typical suburban family MOTHER FATHER eightyear old BOY LITTLE GIRL in a car seat and a GRANDMOTHER A big slobbery DOG is behind a grate Barry pops into the passenger compartment hitting the Mothers magazine MOTHER Theres a bee in the car They all notice the bee and start SCREAMING BARRY Aaahhhh Barry tumbles around the car We see the faces from his POV MOTHER Do something Bee Movie JS REVISIONS FATHER Im driving Barry flies by the little girl in her CAR SEAT She waves hello LITTLE GIRL Hi bee SON Hes back here Hes going to sting me The car SWERVES around the road Barry flies into the back where the slobbery dog SNAPS at him Barry deftly avoids the jaws and gross flying SPITTLE MOTHER Nobody move If you dont move he wont sting you Freeze Everyone in the car freezes Barry freezes They stare at each other eyes going back and forth waiting to see who will make the first move Barry blinks GRANNY He blinked Granny pulls out a can of HAIR SPRAY SON Spray him Granny Granny sprays the hair spray everywhere FATHER What are you doing GRANNY Its hair spray Extra hold MOTHER Kill it Barry gets sprayed back by the hair spray then sucked out of the sunroof CUT TO Bee Movie JS REVISIONS EXT CITY STREET CONTINUOUS BARRY Wow The tension level out here is unbelievable Ive got to get home As Barry flies down the street it starts to RAIN He nimbly avoids the rain at first BARRY CONTD Whoa Whoa Cant fly in rain Cant fly in rain Cant fly in A couple of drops hit him his wings go limp and he starts falling BARRY CONTD Mayday Mayday Bee going down Barry sees a window ledge and aims for it and just makes it Shivering and exhausted he crawls into an open window as it CLOSES SEQ VANESSA SAVES BARRY INT VANESSAS APARTMENT CONTINUOUS Inside the window Barry SHAKES off the rain like a dog Vanessa Ken Andy and Anna ENTER the apartment VANESSA Ken can you close the window please KEN Huh Oh to Andy Hey check out my new resume I made it into a foldout brochure You see It folds out Ken holds up his brochure with photos of himself and a resume in the middle ANGLE ON Barry hiding behind the curtains as Ken CLOSES THE WINDOW Bee Movie JS REVISIONS BARRY Oh no more humans I dont need this Barry HOVERS up into the air and THROWS himself into the glass BARRY CONTD dazed Ow What was that He does it again and then multiple more times BARRY CONTD Maybe this timethis time this time this time this time this time this time this time Barry JUMPS onto the drapes BARRY CONTD out of breath Drapes then re glass That is diabolical KEN Its fantastic Its got all my special skills even my top ten favorite movies ANDY Whats your number one Star Wars KEN Ah I dont go for that makes Star Wars noises kind of stuff ANGLE ON Barry BARRY No wonder were not supposed to talk to them Theyre out of their minds KEN When I walk out of a job interview theyre flabbergasted They cant believe the things I say Barry looks around and sees the LIGHT BULB FIXTURE in the middle of the ceiling Bee Movie JS REVISIONS BARRY re light bulb Oh theres the sun Maybe thats a way out Barry takes off and heads straight for the light bulb His POV The seventyfive watt label grows as he gets closer BARRY CONTD I dont remember the sun having a big seventy five on it Barry HITS the bulb and is KNOCKED SILLY He falls into a BOWL OF GUACAMOLE Andy dips his chip in the guacamole taking Barry with it ANGLE ON Ken and Andy KEN Ill tell you what You know what I predicted global warming I could feel it getting hotter At first I thought it was just me Barrys POV Giant human mouth opening KEN CONTD Wait Stop Beeeeeee ANNA Kill it Kill it They all JUMP up from their chairs Andy looks around for something to use Ken comes in for the kill with a big TIMBERLAND BOOT on each hand KEN Stand back These are winter boots Vanessa ENTERS and stops Ken from squashing Barry VANESSA grabs Kens arm Wait Dont kill him CLOSE UP on Barrys puzzled face KEN You know Im allergic to them This thing could kill me Bee Movie JS REVISIONS VANESSA Why does his life have any less value than yours She takes a GLASS TUMBLER and places it over Barry KEN Why does his life have any less value than mine Is that your statement VANESSA Im just saying all life has value You dont know what hes capable of feeling Barry looks up through the glass and watches this conversation astounded Vanessa RIPS Kens resume in half and SLIDES it under the glass KEN wistful My brochure Theres a moment of eye contact as she carries Barry to the window She opens it and sets him free VANESSA There you go little guy KEN OC Im not scared of them But you know its an allergic thing ANDY OC Hey why dont you put that on your resumebrochure KEN OC Its not funny my whole face could puff up ANDY OC Make it one of your Special Skills KEN OC You know knocking someone out is also a special skill CUT TO Bee Movie JS REVISIONS EXT WINDOWSILL CONTINUOUS Barry stares over the window frame He cant believe whats just happened It is still RAINING DISSOLVE TO SEQ BARRY SPEAKS EXT WINDOWSILL LATER Barry is still staring through the window Inside everyones saying their goodbyes KEN Vanessa next week Yogurt night VANESSA Uh yeah sure Ken You know whatever KEN You can put carob chips on there VANESSA Good night KEN as he exits Supposed to be less calories or something VANESSA Bye She shuts the door Vanessa starts cleaning up BARRY Ive got to say something She saved my life Ive got to say something Alright here it goes Barry flies in Bee Movie JS REVISIONS INT VANESSAS APARTMENT CONTINUOUS Barry hides himself on different PRODUCTS placed along the kitchen shelves He hides on a Bumblebee Tuna can and a Greetings From Coney Island MUSCLEMAN POSTCARD on the fridge BARRY on fridge What would I say landing on a bottle I could really get in trouble He stands looking at Vanessa BARRY CONTD Its a bee law Youre not supposed to talk to a human I cant believe Im doing this Ive got to Oh I cant do it Come on No yes no do it I cant How should I start it You like jazz No thats no good Here she comes Speak you fool As Vanessa walks by Barry takes a DEEP BREATH BARRY CONTD cheerful Ummhi Vanessa DROPS A STACK OF DISHES and HOPS BACK BARRY CONTD Im sorry VANESSA Youre talking BARRY Yes I know I know VANESSA Youre talking BARRY I know Im sorry Im so sorry VANESSA Its okay Its fine Its just I know Im dreaming but I dont recall going to bed Bee Movie JS REVISIONS BARRY Well you know Im sure this is very disconcerting VANESSA Well yeah I mean this is a bit of a surprise to me I meanyoure a bee BARRY Yeah I am a bee and you know Im not supposed to be doing this but they were all trying to kill me and if it wasnt for youI mean I had to thank you Its just the way I was raised Vanessa intentionally JABS her hand with a FORK VANESSA Ow BARRY That was a little weird VANESSA to herself Im talking to a bee BARRY Yeah VANESSA Im talking to a bee BARRY Anyway VANESSA And a bee is talking to me BARRY I just want you to know that Im grateful and Im going to leave now VANESSA Wait wait wait wait how did you learn to do that BARRY What Bee Movie JS REVISIONS VANESSA The talking thing BARRY Same way you did I guess Mama Dada honey you pick it up VANESSA Thats very funny BARRY Yeah Bees are funny If we didnt laugh wed cry With what we have to deal with Vanessa LAUGHS BARRY CONTD Anyway VANESSA Can I uh get you something BARRY Like what VANESSA I dont know I mean I dont know Coffee BARRY Well uh I dont want to put you out VANESSA Its no trouble BARRY Unless youre making anyway VANESSA Oh it takes two minutes BARRY Really VANESSA Its just coffee BARRY I hate to impose Bee Movie JS REVISIONS VANESSA Dont be ridiculous BARRY Actually I would love a cup VANESSA Hey you want a little rum cake BARRY I really shouldnt VANESSA Have a little rum cake BARRY No no no I cant VANESSA Oh come on BARRY You know Im trying to lose a couple micrograms here VANESSA Where BARRY Well These stripes dont help VANESSA You look great BARRY I dont know if you know anything about fashion Vanessa starts POURING the coffee through an imaginary cup and directly onto the floor BARRY CONTD Are you alright VANESSA No DISSOLVE TO SEQ ROOFTOP COFFEE Bee Movie JS REVISIONS EXT VANESSAS ROOF LATER Barry and Vanessa are drinking coffee on her roof terrace He is perched on her keychain BARRY He cant get a taxi Hes making the tie in the cab as theyre flying up Madison So he finally gets there VANESSA Uh huh BARRY He runs up the steps into the church the wedding is on VANESSA Yeah BARRY and he says watermelon I thought you said Guatemalan VANESSA Uh huh BARRY Why would I marry a watermelon Barry laughs Vanessa doesnt VANESSA Oh Is that uh a bee joke BARRY Yeah thats the kind of stuff that we do VANESSA Yeah different A BEAT VANESSA CONTD So anywaywhat are you going to do Barry Bee Movie JS REVISIONS BARRY About work I dont know I want to do my part for the hive but I cant do it the way they want VANESSA I know how you feel BARRY You do VANESSA Sure my parents wanted me to be a lawyer or doctor but I wanted to be a florist BARRY Really VANESSA My only interest is flowers BARRY Our new queen was just elected with that same campaign slogan VANESSA Oh BARRY Anyway see theres my hive right there";


    public static void main(String[] args){
        //get image
        File file = new File(pathName);
        BufferedImage image = null;
        try {
            image = ImageIO.read(file);
        }catch(IOException e){

        }

        //Change all letters to lowercase, reduces image noise
        message = message.toLowerCase();

        //Apply encryption algorithm to message, in this case its standard Caesar Cipher
        message = encryptMessage(message, 3);

        //Turn String into charArray
        char[] charArray = message.toCharArray();

        //Get the pixels encoded with the message
        int[] pixelsDec = createEncryptedPixels(image, charArray);

        //Create the image from the pixels
        BufferedImage encryptedImage = imageFromData(pixelsDec);

        //Draw the image so we can see it
        createJImage(image); //Original
        createJImage(encryptedImage); //Encrypted

        //Decrypt the Image
        message = decryptImage(encryptedImage);

        //Decrypt the Message
        message = decryptMessage(message, 3);

        //Print message
        System.out.println(message);
    }

    public static int[] createEncryptedPixels(BufferedImage image, char[] message){
        int point = 0;
        int offset1 = 131;
        int offset2 = 229;
        boolean end = true;
        String[][] pixelsHex = new String[w][h];
        int[] pixelsDec = new int[w * h];
        for(int currentWidth = 0; currentWidth < w; currentWidth++){
            for(int currentHeight = 0; currentHeight < h; currentHeight++){
                //Get Image Data as array of hex values
                pixelsHex[currentWidth][currentHeight] = Integer.toHexString(image.getRGB(currentWidth, currentHeight));
                if(point < message.length) {
                    //Apply Message Data to the Alpha values
                    if(Character.isSpaceChar(message[point])){
                        pixelsHex[currentWidth][currentHeight] = "ff" + pixelsHex[currentWidth][currentHeight].substring(2);
                    }else{
                        pixelsHex[currentWidth][currentHeight] = Integer.toHexString(((int) message[point]) + offset1) + pixelsHex[currentWidth][currentHeight].substring(2);
                    }
                }else if(end){
                    pixelsHex[currentWidth][currentHeight] = "fe" + pixelsHex[currentWidth][currentHeight].substring(2);
                    end = false;
                }else{
                    //Create Sudo-Random noise
                    pixelsHex[currentWidth][currentHeight] = "" + Integer.toHexString(rand.nextInt(26) + offset2) + pixelsHex[currentWidth][currentHeight].substring(2);
                }
//                System.out.print(pixelsHex[i][j] + " ");
                int val = 0;

                //Convert hex values back to dec values
                for(int k = 0; k < pixelsHex[currentWidth][currentHeight].length(); k++){
                    val *= 16;
                    char c = pixelsHex[currentWidth][currentHeight].charAt(k);
                    val = val + Integer.parseInt(c + "", 16);
                }
                pixelsDec[point] = val;
//                System.out.print(pixelsDec[point] + " ");
                point++;
            }
//            System.out.println();
        }
        return pixelsDec;
    }

    public static void createJImage(BufferedImage image){
        //Display image
        BufferedImage newImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                newImage.setRGB(i, j, image.getRGB(i, j));
            }
        }
        ImageIcon icon = new ImageIcon(newImage);
        JLabel label = new JLabel(icon);
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(200,200);
        f.setVisible(true);
    }

    public static String decryptImage(BufferedImage encryptedImage){
        //Basically just inverse of the encryption but without the noise.
        int offset = 131;
        boolean end = true;
        String[][] pixelsHex = new String[w][h];
        String message = "";
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++) {
                pixelsHex[i][j] = Integer.toHexString(encryptedImage.getRGB(i, j));
                int val = 0;
                for (int k = 0; k < 2; k++) {
                    val *= 16;
                    char c = pixelsHex[i][j].charAt(k);
                    val = val + Integer.parseInt(c + "", 16);
                }
                val -= offset;
                if (val == 123)
                    end = false;
                else if(val == 124 && end){
                    message += " ";
                }else if(end)
                    message += (char) val;
            }
        }
        return message;
    }

    public static BufferedImage imageFromData(int[] pixels){
        BufferedImage encryptedImage = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
        int point = 0;
        for(int i = 0; i < w; i++){
            for(int j = 0; j < h; j++){
                encryptedImage.setRGB(i, j, pixels[point]);
                point++;
//                System.out.print(pixels[point]);
            }
        }
        return encryptedImage;
    }



    //These are empty
    public static String encryptMessage(String message, int s){
        //Standard Caesar Cipher, can be replaced with different code
        String result = "";
        for(int i = 0; i < message.length(); ++i){
            char c = message.charAt(i);
            if(Character.isLowerCase(c)) {
                c = (char) (c + s);

                if (c > 'z') {
                    c = (char) (c - 'z' + 'a' - 1);
                }
                result += c;
            }else{
                result += c;
            }
        }
        return result;
    }
    public static String decryptMessage(String message, int s){
        //Standard Caesar Cipher, can be replaced with different code
        String result = "";
        for(int i = 0; i < message.length(); ++i){
            char c = message.charAt(i);
            if(Character.isLowerCase(c)){
                c = (char)(c - s);
                if(c < 'a'){
                    c = (char)(c + 'z' - 'a' + 1);
                }
                result += c;
            }else{
                result += c;
            }
        }
        return result;
    }
}
