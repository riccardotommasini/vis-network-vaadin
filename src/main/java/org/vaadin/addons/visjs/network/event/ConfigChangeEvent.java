package org.vaadin.addons.visjs.network.event;

import com.vaadin.flow.component.DomEvent;
import com.vaadin.flow.component.EventData;

import org.vaadin.addons.visjs.network.NetworkDiagram;
import org.vaadin.addons.visjs.network.api.Event;
import elemental.json.JsonException;
import elemental.json.JsonObject;

@SuppressWarnings("serial")
@DomEvent("vaadin-configChange")
public class ConfigChangeEvent extends Event {
  public ConfigChangeEvent(final NetworkDiagram source, boolean fromClient,
      @EventData("event.detail") final JsonObject params) throws JsonException {
    super(source, fromClient, params);
  }
}