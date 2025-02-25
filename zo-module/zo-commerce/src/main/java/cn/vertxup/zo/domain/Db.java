/*
 * This file is generated by jOOQ.
 */
package cn.vertxup.zo.domain;


import cn.vertxup.zo.domain.tables.ZoRoom;

import java.util.Arrays;
import java.util.List;

import io.vertx.tp.ke.refine.Ke;
import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Db extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DB_SCAFFOLD</code>
     */
    public static final Db DB_SCAFFOLD = new Db();

    /**
     * The table <code>DB_SCAFFOLD.ZO_ROOM</code>.
     */
    public final ZoRoom ZO_ROOM = ZoRoom.ZO_ROOM;

    /**
     * No further instances allowed
     */
    private Db() {
        super(Ke.getDatabase(), null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.asList(
            ZoRoom.ZO_ROOM
        );
    }
}
