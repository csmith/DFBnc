/*
 * Copyright (c) 2006-2017 DFBnc Developers
 *
 * Where no other license is explicitly given or mentioned in the file, all files
 * in this project are licensed using the following license.
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
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.dfbnc.commands.filters;

import com.dfbnc.commands.CommandOutputBuffer;
import com.dfbnc.util.Util;

/**
 * Filter that excludes any messages matching the parameters.
 */
public class ExcludeFilter implements CommandOutputFilter {

    @Override
    public void runFilter(final String[] params, final CommandOutputBuffer output) throws CommandOutputFilterException {
        output.removeMessagesIf(s -> s.toLowerCase().matches(".*" + Util.joinString(params, " ").toLowerCase() + ".*"));
    }

}
