package org.carlos.jobsearch;

import com.beust.jcommander.JCommander;
import org.carlos.jobsearch.cli.CLIArguments;

import static org.carlos.jobsearch.CommanderFunctions.buildCommanderWithName;

public class JobSearch {
    public static void main(String[] args) {
        JCommander jCommander = buildCommanderWithName("job-search", CLIArguments::newInstance);
    }
}
