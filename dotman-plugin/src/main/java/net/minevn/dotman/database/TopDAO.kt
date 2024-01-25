package net.minevn.dotman.database

import net.minevn.dotman.DotMan
import net.minevn.libs.bukkit.db.DataAccess

abstract class TopDAO : DataAccess() {
    companion object {
        fun getInstance() = DotMan.instance.getDAO(TopDAO::class)
    }
}