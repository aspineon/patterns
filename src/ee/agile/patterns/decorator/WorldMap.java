package ee.agile.patterns.decorator;

public class WorldMap extends AsciiMap {
    private static final String[] WORLD = {
        "           . _..::__:  ,-\"-\"._        |7       ,     _,.__             ",
        "   _.___ _ _<_>`!(._`.`-.    /         _._     `_ ,_/  '  '-._.---.-.__",
        ">.{     \" \" `-==,',._\\{  \\  / {)      / _ \">_,-' `                mt-2_",
        "  \\_.:--.       `._ )`^-. \"'       , [_/(                       __,/-' ",
        " '\"'     \\         \"    _L        oD_,--'                )     /. (|   ",
        "          |           ,'          _)_.\\\\._<> 6              _,' /  '   ",
        "          `.         /           [_/_'` `\"(                <'}  )      ",
        "           \\\\    .-. )           /   `-'\"..' `:.#          _)  '       ",
        "    `        \\  (  `(           /         `:\\  > \\  ,-^.  /' '         ",
        "              `._,   \"\"         |           \\`'   \\|   ?_)  {\\         ",
        "                 `=.---.        `._._       ,'     \"`  |' ,- '.        ",
        "                   |    `-._         |     /          `:`<_|h--._      ",
        "                   (        >        .     | ,          `=.__.`-'\\     ",
        "                    `.     /         |     |{|              ,-.,\\     .",
        "                     |   ,'           \\   / `'            ,\"     \\     ",
        "                     |  /              |_'                |  __  /     ",
        "                     | |                                  '-'  `-'   \\.",
        "                     |/                                         \"    / ",
        "                     \\.                                             '  ",
        "                                                                       ",
        "                      ,/            ______._.--._ _..---.---------._   ",
        "     ,-----\"-..?----_/ )      __,-'\"             \"                  (  ",
        "-.._(                  `-----'                                       `-"
    };

    public WorldMap() {
        super(WORLD);
    }
}