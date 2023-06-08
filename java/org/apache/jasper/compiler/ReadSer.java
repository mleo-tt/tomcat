/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.jasper.compiler;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadSer {
    public static void main(String[] args) throws Exception {
        final File file = new File(args[0]);
        final FileInputStream fileInputStream = new FileInputStream(file);
        final ObjectInputStream stream = new ObjectInputStream(fileInputStream);
        final Object o = stream.readObject();
        stream.close();
        System.out.println("Read stream from " + args[0]);
    }
}
