/****************************************************************************
 The Super Analyzer
 Copyright (C) 2009 Tom Bulatewicz, Nosleep Software

 This program is free software; you can redistribute it and/or
 modify it under the terms of the GNU General Public License
 as published by the Free Software Foundation; either version 2
 of the License, or (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program; if not, write to the Free Software
 Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 ***************************************************************************/

package net.nosleep.superanalyzer.panels;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import net.nosleep.superanalyzer.util.Theme;

public class TextPanel extends JPanel
{
	private static final long serialVersionUID = 1L;

	public TextPanel(JPanel innerPanel, String titleString, boolean tagsWarning, HomePanel homePanel)
	{
		setLayout(new FlowLayout());

		JPanel contentPanel = new JPanel();

		contentPanel.setLayout(new BorderLayout());
		contentPanel.setBackground(Color.white);
		contentPanel.setPreferredSize(new Dimension(600, 400));

		contentPanel.add(innerPanel, BorderLayout.CENTER);

		JPanel titlePanel = new JPanel(new FlowLayout());
		titlePanel.setOpaque(false);
		JLabel titleLabel = new JLabel(titleString);
		titleLabel.setFont(Theme.getBoldFont(20));
		titlePanel.add(titleLabel);
		titlePanel.setPreferredSize(new Dimension(500, 40));

		if (tagsWarning == true)
			titlePanel.add(homePanel.createWarningPanel(false));

		contentPanel.add(titlePanel, BorderLayout.NORTH);

		contentPanel.setBorder(new LineBorder(Color.gray));

		add(contentPanel);
	}
}
