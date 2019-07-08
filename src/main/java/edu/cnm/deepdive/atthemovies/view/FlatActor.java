package edu.cnm.deepdive.atthemovies.view;

import java.net.URI;
import java.util.Date;
import java.util.UUID;

public interface FlatActor {

  UUID getId();

  String getName();

  Date getCreated();

  Date getUpdated();

  URI getHref();

}
