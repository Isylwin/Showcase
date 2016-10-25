/**
 * The MIT License
 * Copyright (c) 2014 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 **/

package nl.eventhandlertest.event.events;

import nl.eventhandlertest.event.framework.Event;

/**
 * The AbstractEvent class serves as a base class for defining events happening with the SSTEngine.
 *
 * @author Ilkka Seppälä
 * @author Oscar de Leeuw
 */
public abstract class AbstractEvent implements Event {

    @Override
    public Class<? extends Event> getType() {
        return getClass();
    }
}
