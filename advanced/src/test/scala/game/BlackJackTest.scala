package game

import org.scalatest.{FlatSpec, Matchers}

class BlackJackTest extends FlatSpec with Matchers{

  behavior of "Hand"

  it should "start with no cards" in {
    val hand = new Hand
    hand.cards.size should equal(0)
  }

  behavior of "Deck"

  it should "start with shuffled deck of 52 cards" in {
    val deck = new Deck
    deck.cards.size should equal(52)
  }

  behavior of "BlackJack"

  it should "deal cards" in {
    val blackJack = new BlackJack()
    val deck = new Deck
    deck.cards.clear()
    //deck.cards += Card(...)
    //deck.cards += Card(...)
    //blackJack.dealCards(new Deck) should equal (Card(...), Card(...))
    ???
  }

  it should "playHand should return zero credit if player loose " in {
    val blackJack = new BlackJack()
    val deck = new Deck
    deck.cards.clear()
    //deck.cards += Card(...)
    //deck.cards += Card(...)
    //blackJack.playHand(100)(_ => deck) should equal (0, Card(...), Card(...))
    ???
  }
}
