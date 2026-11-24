// Task 6.5: querying a database using Exposed's SQL DSL

import org.jetbrains.exposed.v1.core.*
import org.jetbrains.exposed.v1.jdbc.*
import org.jetbrains.exposed.v1.jdbc.transactions.transaction

fun main() {
    // Count numbers of artists & albums in database

    val numArtists = transaction(MusicDatabase.db) {
        ArtistTable.selectAll().count()
    }
    println("Number of artists: $numArtists")

    val numAlbums = transaction {
        AlbumTable.selectAll().count()
    }
    println("Number of albums: $numAlbums")

    transaction {
        // Find & display all the bands in the database

        println("Bands in the database:")
        ArtistTable.selectAll().where { ArtistTable.isSolo eq false }.forEach {
            println(it[ArtistTable.artistName])
        }

        // Find & display details of all albums recorded after a specific year
        val specificYear = 1960
        println("Albums recorded after $specificYear:")
        (AlbumTable innerJoin ArtistTable)
            .selectAll()
            .where { AlbumTable.year greater specificYear }
            .forEach {
                println("${it[ArtistTable.artistName]} - ${it[AlbumTable.title]} (${it[AlbumTable.year]})")
            }
    }
}
