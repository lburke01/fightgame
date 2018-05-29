private class DrawCanvas extends JPanel
{
		@Override
		public void paintComponent(Graphics g)
    {
			super.paintComponent(g);
			setBackground(Color.BLACK);
			g.setColor(Color.WHITE);
			g.fillRect(x,y,size,size);
			g.setColor(Color.RED);
			g.fillRect(x2, y2, size, size);
		}
}
