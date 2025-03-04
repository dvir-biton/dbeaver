/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2024 DBeaver Corp and others
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.model.sql;

import org.jkiss.dbeaver.model.exec.DBCSession;
import org.jkiss.dbeaver.model.exec.DBCStatistics;

/**
 * SQLQueryListener
 *
 * @author Serge Rider
 */
public interface SQLQueryListener
{
    void onStartScript();

    void onStartQuery(DBCSession session, SQLQuery query);

    void onEndQuery(DBCSession session, SQLQueryResult result, DBCStatistics statistics);

    void onEndScript(DBCStatistics statistics, boolean hasErrors);

    void onEndSqlJob(DBCSession session, SqlJobResult result);
}
