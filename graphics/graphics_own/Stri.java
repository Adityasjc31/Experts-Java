package graphics.graphics_own;

class Stri
{
    public String u()
    {
        String s="Usage: javac <options> <source files>\n"+
            "  @<filename>                  Read options and filenames from file\n"+
            "  --add-modules <module>(,<module>)*\n"+
            "es\n"+
            "  --boot-class-path <path>, -bootclasspath <path>\n"+
            "  --class-path <path>, -classpath <path>, -cp <path>\n"+
            "  -d <directory>               Specify where to place generated class files\n"+
            "        Output source locations where deprecated APIs are used\n"+
            "  -endorseddirs <dirs>         Override location of endorsed standards path\n"+
            "  -g                           Generate all debugging info\n"+
            "  -g:none                      Generate no debugging info\n"+
            "        Specify where to place generated native header files\n"+
            "  --help-extra, -X             Print help on extra options\n"+
            "        Specify whether or not to generate class files for implicitly referenced\n"+
            "  -J<flag>                     Pass <flag> directly to the runtime system\n"+
            "        Limit the universe of observable modules\n"+
            "        Compile only the specified module, check timestamps\n"+
            "        Specify where to find application modules\n"+
            "        Specify where to find input source files for multiple modules\n"+
            "        Specify version of modules that are being compiled\n"+
            "  -parameters\n"+
            "  -proc:{none,only}\n"+
            "  -processor <class1>[,<class2>,<class3>...]\n"+
            "ocess\n"+
            "        Specify a module path where to find annotation processors\n"+
            "        Specify where to find annotation processors\n"+
            "        Check that API used is available in the specified profile\n"+
            "        Compile for a specific VM version. Supported targets: 10, 6, 7, 8, 9\n"+
            "  -source <release>\n"+
            "  --source-path <path>, -sourcepath <path>\n"+
            "  --system <jdk>|none          Override location of system modules\n"+
            "  --upgrade-module-path <path>\n"+
            "  -verbose                     Output messages about what the compiler is doing\n"+
            "  -Werror                      Terminate compilation if warnings occur\n";
        return s;
    }

    public String u1()
    {
        String u="Usage: java [options] <mainclass> [args...]\n"+
            "   or  java [options] -jar <jarfile> [args...]\n"+
            "   or  java [options] -m <module>[/<mainclass>] [args...]\n"+
            "           (to execute the main class in a module)\n"+
            " Arguments following the main class, -jar <jarfile>, -m or --module\n"+
            "\n"+
            "\n"+
            "    -classpath <class search path of directories and zip/jar files>\n"+
            "                  A ; separated list of directories, JAR archives,\n"+
            "    -p <module path>\n"+
            "                  A ; separated list of directories, each directory\n"+
            "    --upgrade-module-path <module path>...\n"+
            "                  is a directory of modules that replace upgradeable\n"+
            "    --add-modules <module name>[,<module name>...]\n"+
            "                  <module name> can also be ALL-DEFAULT, ALL-SYSTEM,\n"+
            "    --list-modules\n"+
            "    -d <module name>\n"+
            "                  describe a module and exit\n"+
            "                  The --dry-run option may be useful for validating the\n"+

            "    --validate-modules\n"+
            "                  The --validate-modules option may be useful for finding   -D<name>=<value>\n"+
            "    -verbose:[class|module|gc|jni]\n"+
            "    -version      print product version to the error stream and exit\n"+
            "    -showversion  print product version to the error stream and continue\n"+
            "                  print product version to the output stream and continue\n"+
            "                  show module resolution output during startup\n"+
            "                  print this help message to the error stream\n"+
            "    -X            print help on extra options to the error stream\n"+
            "    -ea[:<packagename>...|:<classname>]\n"+
            "                  enable assertions with specified granularity -disableassertions[:<packagename>...|:<classname>]\n"+
            "    -esa | -enablesystemassertions\n"+
            "    -dsa | -disablesystemassertions\n"+
            "    -agentlib:<libname>[=<options>]\n"+
            "                  see also -agentlib:jdwp=help\n"+
            "                  load native agent library by full pathname\n"+
            "                  load Java programming language agent, see java.lang.instrument\n"+
            "    -splash:<imagepath>\n"+
            "                  HiDPI scaled images are automatically supported and used\n"+
            "                  should always be passed as the argument to the -splash option.\n"+
            "                  The most appropriate scaled image provided will be picked up See the SplashScreen API documentation for more information one or more argument files containing options   prevent further argument file expansion\n"+
            "--<name> <value>.\n";

        return u;
    }
}