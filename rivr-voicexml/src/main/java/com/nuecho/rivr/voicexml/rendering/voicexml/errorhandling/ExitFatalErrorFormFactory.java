/*
 * Copyright (c) 2013 Nu Echo Inc. All rights reserved.
 */

package com.nuecho.rivr.voicexml.rendering.voicexml.errorhandling;

import com.nuecho.rivr.voicexml.rendering.voicexml.*;

/**
 * @author Nu Echo Inc.
 */
public class ExitFatalErrorFormFactory extends AbstractFatalErrorFactory {

    public ExitFatalErrorFormFactory() {
        super(VoiceXmlDomUtil.EXIT_ELEMENT);
    }

}
