package com.twu.biblioteca.options;

import com.twu.biblioteca.Biblioteca;
import com.twu.biblioteca.resources.Book;
import com.twu.biblioteca.resources.Movie;
import com.twu.biblioteca.resources.Resource;

/**
 * Created by gdias on 8/3/15.
 */
public class ListResourcesOption extends AbstractOption {
    public ListResourcesOption(int id, String name) {
        super(id, name);
    }

    @Override
    public String execute(Biblioteca biblioteca) {
        String resultString = "";
        for(Resource resource: biblioteca.listResources()) {
            resultString += resource.showDetails() + "\n";
        }
        return resultString;
    }
}
